package threads;

public class Threads2 {
	
	public static class  MyRunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("is running");
			
		}
		
		
	}
	
	public static void main(String[] args) {

		Thread myThread =new Thread(new MyRunnable());
		
		myThread.start();
		
		
	}
	

}
