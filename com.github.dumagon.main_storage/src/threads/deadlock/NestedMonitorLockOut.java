package threads.deadlock;

class Monitor{}

class Locker{
	
	Monitor monitor =new Monitor();
	boolean isLocked =false;
	Thread currentThread = null;
	
	public void lock() {
		
		
		
		synchronized (this) {
			while(isLocked) {
				
				synchronized(monitor) {
				
				try {
					
					this.monitor.wait();
					
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();

				}
				
				
			}
		} isLocked=true;
		
		
		
		
	}
	
	}

	
	// in order to unlock the unlocking thread needs to access (this)object which might be already locked by 
	// another thread that entered lock() and took hold over (this) .
	// so both threads end up waiting indefinitely one in the while() wait() block and the other trying to
	// access the object the first thread has locked .
	
	public void unLock() {
		
		synchronized (this) {
			
			this.isLocked=false;
			
			synchronized (monitor) {
				
				this.monitor.notify();
			}
			
			
		}
		
		
	}
	
	
}



public class NestedMonitorLockOut {
	public static void main(String[] args) {
		
		Locker locker = new Locker();
		
		Thread th1=new Thread() {
			
			@Override
			public void run() {
				locker.lock();
				
				System.out.println("monitor is locked by th1");
				
			
				
				
				locker.unLock();
				System.out.println("unlocked by th1");
				

			};
			
		};
		
		Thread th2=new Thread() {
			
			@Override
			public void run() {
				locker.lock();
				
				System.out.println("monitor is locked by th2");
				
				
				
				
				locker.unLock();
				System.out.println("unlocked by th2");
				
				
			};
			
		};
		
		th1.start();
		th2.start();
		

	}

}
