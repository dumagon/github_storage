package threads;

public class Threads7 {
	
	
	public static class StoppableRunnable implements Runnable{
		
		private boolean Stoprequested=false;
		
		public synchronized void requestStop() {
			
			this.Stoprequested=true;
		}
		
		public synchronized boolean isStopRequested() {
			
			return this.Stoprequested;
		}
		
		public void sleep(long millis) {
			
			try {
				
				Thread.sleep(millis);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		

		@Override
		public void run() {
			
			System.out.println("StoppableRunnable is running");
			
			while(!Stoprequested) {
				
				sleep(2000);
				
				System.out.println("......");
			}
			System.out.println("the app was finished");
			
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		StoppableRunnable instance =new StoppableRunnable();
		
		Thread thread =new Thread(instance,"my thread");
		
		thread.start();
		
		try {
			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println("requesting stop");
		instance.requestStop();
		System.out.println("stop requested");

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
