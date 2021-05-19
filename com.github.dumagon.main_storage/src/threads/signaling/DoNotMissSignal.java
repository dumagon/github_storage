package threads.signaling;

class MonitorObject1{}

class MyWaitNotify1{
	
	private boolean wasSignalled=false; /// !!!! introducing a flag 
	
	
	public MonitorObject1 monitor =new MonitorObject1();
	
	
	public void doWait() {
		
		synchronized (monitor) {
			
			// checking if notify() was already called 
			
			if(!wasSignalled) {
			try {
				monitor.wait();
				System.out.println(" was not signalled");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}else {
			
			wasSignalled=false;
			System.out.println(" was signalled");}
	}
		
}
	
	
	
	public void doNotify() {
		
		synchronized (monitor) {
			wasSignalled=true;
			monitor.notify();
			
		}
		
	}
	
	
	
}




public class DoNotMissSignal {
	
	
	public static void main(String[] args) {

		MyWaitNotify1 myWaitNotify = new MyWaitNotify1();
		
		
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
		
		
		b1.start();
		
		try {
			Thread.sleep(3000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		a1.start();
		
		
		
	}
	

}





















