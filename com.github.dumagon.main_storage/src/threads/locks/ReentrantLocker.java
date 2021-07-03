package threads.locks;

class ReentrantLock{
	
	boolean isLocked=false;
	
	Thread lockedBy =null;
	
	int lockCount =0;
	
	
	
	public void lock() {
		
		Thread currentThread =Thread.currentThread();
		
		while(isLocked && lockedBy!=currentThread) {
			
			try {
				this.wait();
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
		isLocked=true;
		
		lockedBy=currentThread;
		
		lockCount++;
				
		
		
		
	}
	
	
	public void unlock() {
		
		if(Thread.currentThread()==lockedBy) {
			
			if(lockCount==0) {
				
				isLocked=false;
				this.notify();
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}



class Reentrance{
	
	
	ReentrantLock lock =new ReentrantLock();
	
	public void outer() {
		
		lock.lock();
		System.out.println("outer");
		inner();
		lock.unlock();
		
	}
	
	
	private void inner() {
		lock.lock();
		System.out.println("inner");
		lock.unlock();
		
	}
	
	
}







public class ReentrantLocker {
	
	
	
	public static void main(String[] args) {
		
		
		Reentrance reentrance =new Reentrance();

		Thread th1 =new Thread() {
			
			@Override
			public void run() {

				reentrance.outer();
				
				
			};
			
		};
		
		
		th1.start();
		
		
	}

}



















