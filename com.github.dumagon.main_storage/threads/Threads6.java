package threads;

public class Threads6 {
	
	
	public static void main(String[] args) {

		Runnable runnable =() ->{
			
			String threadName =Thread.currentThread().getName();
			
			System.out.println(threadName+" is running");
			
			try {
				
				Thread.sleep(9000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
			System.out.println(threadName+" finished");
				
			};
			
			Thread thread =new Thread(runnable,"this thread");
			
			thread.start();
			
			
		}
	
	
		
		
	}


