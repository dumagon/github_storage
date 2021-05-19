package threads.signaling;

/// this class can be actually called SpuriousWakeUps 2.0 
/// Here I used an implementation of Runnable as a parameter to create threads


class MyMonitorObject1{}


class MySpinLock1{
	
	
	MyMonitorObject1 myMonitorObject =new MyMonitorObject1();
	
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
			
			
			
		}
		
		
		
		
	}
	
	
public void doNotifyAll() {
		
		synchronized (myMonitorObject) {
			wasSignalled=true;
			myMonitorObject.notifyAll();
			
		}
		
	}
	
	
	
	
}


class MyRunnable implements Runnable{

	MySpinLock1 mySpinLock =new MySpinLock1();
	
	@Override
	public void run() {
		
		
		
		
		mySpinLock.doWait();
		
		System.out.println(Thread.currentThread().getName());
		
		
		
	}
	
	
	
	
}



public class Spurious {
	
	public static void main(String[] args) {
		
		MyRunnable myRunnable =new MyRunnable();

		Thread thr1=new Thread(myRunnable,"1");
		Thread thr2=new Thread(myRunnable,"2");
		Thread thr3=new Thread(myRunnable,"3");
		
		Thread  thr4=new Thread() {
			
			@Override
			public void run() {

				MySpinLock1 msl=myRunnable.mySpinLock;
				
				for (int i = 0; i < 4; i++) {
					
					msl.doNotifyAll();
					
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
















