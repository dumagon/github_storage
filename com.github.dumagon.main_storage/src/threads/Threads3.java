package threads;

public class Threads3 {
	
	public static void main(String[] args) {
		
		Runnable runnable=new Runnable(){

			@Override
			public void run() {
				System.out.println("is running");
				
			}
	};
	
	
	Thread thread =new Thread(runnable);
	
	thread.start();
		

	}

}
