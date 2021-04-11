package threads;

class MyRunnanable implements Runnable{
	
	private boolean doStop =false;
	
	
	
	public  synchronized void doStop() {
		
		this.doStop=true;
	}
	
	
	private synchronized boolean keepRunning() {
		
		return this.doStop==false;
		
	}
	
	
	

	@Override
	public void run() {
		
		while(keepRunning()) {
			
			System.out.println(" running ");
			
			// do some code ...........
			
		}
		
		
		try {
			
			Thread.sleep(2L*1000L);
			
		}catch(InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		
		
		
		
	}
	
	
	
	
}

public class StopThread {
	
	public static void main(String[] args) {
		
		
		MyRunnable mrn =new MyRunnable();
		
		Thread thread =new Thread(mrn);
		
		thread.start();
		
		try {
			
			Thread.sleep(8L*1000L);
			
		}catch(InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		
		mrn.doStop();

		
		
	}
	

}














