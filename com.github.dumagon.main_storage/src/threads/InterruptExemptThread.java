package threads;

public class InterruptExemptThread {
	
	public static void main(String[] args) {

		Thread loop =new Thread(new Runnable() {
 
			private boolean interrupted=false;
			
			@Override
			public void run() {
				
				while(!interrupted) {
					
					System.out.println("running");
					
					try {
						Thread.sleep(10L*1000L);
					} catch (InterruptedException e) {
						
						System.out.println("sleep"+e.toString());
						interrupted=true;
						
					}
					
					
					
				}
				
				
				
			}
				
				
				
		});
		
		
		
		loop.start();
		
		loop.interrupt();
		
		
	}
	

}
