package threads;



public class InterruptThread {
	
	public static void main(String[] args) {

		Thread loop = new Thread(new Runnable() {

			@Override
			public void run() {
				
				while(true) {
					
					System.out.println("loop is running");
					
					if(Thread.interrupted()) break;
					
				};
				
				
			}
				
				
				
		});
		
		
		loop.start();
		loop.interrupt();
		
		
	}
	

}
