package threads;

public class Threads4 {
	
	
	public static void main(String[] args) {

		Runnable runnable = () ->{
			
			System.out.println("Lambda is running");
		};
		
		
		Thread thread =new Thread(runnable);
		thread.start();
		
		
	}

}
