package threads;

public class InterruptExpToRunTime {
	
	
	public static void main(String[] args) {

		Thread loop =new Thread(new Runnable() {
 
			
			
			@Override
			public void run() {
				
				while(true) {
					
					System.out.println("running");
					
					try {
						Thread.sleep(10L*1000L);
					} catch (InterruptedException e) {
					
					// we have to set the flag interrupted to true again	
						
					Thread.currentThread().interrupt();
					
					
					throw new RuntimeException(e);
					
						
					}
					
					
					
				}
				
				
				
			}
				
				
				
		});
		
		
		
		loop.start();
		
		loop.interrupt();
		
		
	}
	

}
