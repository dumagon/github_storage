package threads.semaphors;

class Monitors{}

public class MySemaphore {
	
	Monitors monitor =new Monitors();
	
	private boolean signal =false;
	
	public  void take() {
		synchronized(monitor) {
		this.signal=true;
		monitor.notify();
		
	};
	
	}
	
	public  void release() throws InterruptedException {
		
		synchronized(monitor) {
			
			System.out.println("checking if signalled");
		while(!signal) {
			
			monitor.wait();
		}
		 this.signal=false;
	}
	
	}
}
