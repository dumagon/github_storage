package threads;


class MyRunnable implements Runnable{
	
	private boolean doStop=false;
	
	public synchronized void doStop() {
		
		this.doStop=true;
	}
	
	
	private synchronized boolean keepRunning() {
		
		return this.doStop==false;
	}
	
	
	
	

	@Override
	public void run() {
		
		while(keepRunning()) {
			
			System.out.println(" running ");
			
			
			try {
				
				Thread.sleep(3L*1000L);
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
		}
	
		
	}
	
	
	
}

public class ThreadStop {
	
	
	public static void main(String[] args) {
		
		MyRunnable runnable =new MyRunnable();

		Thread thread = new Thread(runnable);
		
		thread.start();
		
		try {
			
			Thread.sleep(10L*1000L);
		}catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		runnable.doStop();
		
		
	}

}

























