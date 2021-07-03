package threads.signaling;




class MyMonitorObject{}

class MySpinLock{
	
	
	MyMonitorObject myMonitorObject =new MyMonitorObject();
	
	private boolean wasSignalled =false;
	
	
	public void doWait() {
		
		synchronized(myMonitorObject){
			
			// every time the waiting thread wakes up it checks if the notify method was called 
			
			while(!wasSignalled) {
				
				try {
					
					myMonitorObject.wait();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				
			}
			
			wasSignalled=false;
			System.out.println(Thread.currentThread().getName()+" notified ");
			
			
			
		}
		
		
		
		
	}
	
	
public void doNotifyAll() {
		
		synchronized (myMonitorObject) {
			wasSignalled=true;
			myMonitorObject.notifyAll();
			
		}
		
	}
	
	
	
	
}

public class SpuriousWakeUps {
	public static void main(String[] args) {
		
		 MySpinLock mySpinLock=new MySpinLock();
		 
		 
		 
		 
		 
		 
		 
		 
			Thread thr1=new Thread("1") {
				
				@Override
				public void run() {

					mySpinLock.doWait();
					
					System.out.println(Thread.currentThread().getName());
					
				}
				
				
				
			};
			
		
		

	
		
		Thread thr2=new Thread("2"){
			
			@Override
			public void run() {

				mySpinLock.doWait();
				
				System.out.println(Thread.currentThread().getName());
			}
			
			
			};
			
			
			
			
		Thread thr3=new Thread("3"){
			
			@Override
			public void run() {

				mySpinLock.doWait();
				System.out.println(Thread.currentThread().getName());
			};
		};
			
		
		Thread thr4=new Thread() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 4; i++) {
					
					mySpinLock.doNotifyAll();
					
					try {
						Thread.sleep(3000L);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				
				
			};
			
			
			
		};
		
		thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();
		
	}

}

















