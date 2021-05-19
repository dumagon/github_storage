package threads.signaling;

class MonitorObject{}


class MyWaitNotify{
	
	
	public MonitorObject monitor =new MonitorObject();
	
	
	public void doWait() {
		
		synchronized (monitor) {
			try {
				monitor.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public void doNotify() {
		
		synchronized (monitor) {
			monitor.notify();
		}
		
	}
	
	
	
}



public class WaitNotify {
	
	
	public static void main(String[] args) {

		MyWaitNotify myWaitNotify = new MyWaitNotify();
		
		
		// a1 will wait till b1 prints out the parent class of  monitor and wakes up a1 ;
		
		
		Thread a1=new Thread() {
			
			
			@Override
			public void run() {

				myWaitNotify.doWait();
				
				System.out.println(myWaitNotify.monitor.hashCode());
				
				
				
			};
		};
		
		Thread b1=new Thread() {
			
			
			@Override
			public void run() {
				
				
				System.out.println(myWaitNotify.monitor.getClass());
				
				myWaitNotify.doNotify();
				
				
				
				
			};
		};
		
		a1.start();
		b1.start();
		
	
		
		
		
		
		
		
	}
	
	

}














