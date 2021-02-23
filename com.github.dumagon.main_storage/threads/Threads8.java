package threads;

public class Threads8 {
	
	
	public static void main(String[] args) {

		Runnable runnable = ()->{
			
			while(true) {                                                                                           //           endless loop
				
				sleep(1000);
				
				System.out.println("running");
				
			}
			
		};
		
		
		Thread thread =new Thread(runnable);
		
		thread.setDaemon(true);                                                                               //           to terminate
		
		thread.start();
		
		sleep(5000);
		
		
		
	}
	
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			// TODO: handle exception
			
		
		}
		
	}
	

}
