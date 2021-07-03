package threads.deadlock;

class SlipLocker{
	
	
	boolean isLocked =false;
	
	
	public void lock() {
		
		synchronized (this) {
			
			while(isLocked) {
				
				try {
					System.out.println("waiting");
					this.wait();
					
					
				} catch (InterruptedException e) {

					// continue waiting 
				}
				
				
				
			} 
			
			// after the first thread exits while() 
			//and before it changes the condition the next thread may enter while() and read the condition 
			// that has not been changed yet. 
			
			synchronized (this) {
				
				isLocked=true;
				System.out.println("locked");
			}
			
		}
		
		
		
		
	}
	
	public synchronized void unLock() {
		
		isLocked=false;
		this.notify();
		
	}
	
	
	
}



public class SlippedConditions {
	
	public static void main(String[] args) {
		
		SlipLocker sliplock=new SlipLocker();
 
		
		Thread th1 =new Thread() {
				
			@Override
			public void run() {

				sliplock.lock();
				System.out.println("is locked by th1");
				
				sliplock.unLock();
				System.out.println("is unlocked by th1");
				
				
				
			};	
				
		};
		Thread th2 =new Thread() {
			
			@Override
			public void run() {
				
				sliplock.lock();
				System.out.println("is locked by th2");
				
				sliplock.unLock();
				System.out.println("is unlocked by th2");
				
				
				
			};	
			
		};
		
		
		th1.start();
		th2.start();
		
		
		
		
		
	}
	
	
	

	

}
