package threads;

public class Threads5 {
	
	
	public static void main(String[] args) {

		Runnable runnable = () ->{
			
			String threadName=Thread.currentThread().getName();
			
			System.out.println(threadName+"  is running");
		};
		
		
		Thread thread1 =new Thread(runnable,"thread 1");
		Thread thread2 =new Thread(runnable,"thread 2");
		thread1.start();
		thread2.start();
		
		
	}

}
