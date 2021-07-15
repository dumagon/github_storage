package threads.semaphors;

class MyCountingSemaphore{
	
	private int signals=0;
	
	
	public synchronized void take() {
		
		this.signals++;
		this.notify();
	}
	
	
	
	public synchronized void release() throws InterruptedException {
		while(signals==0) this.wait();
		this.signals--;
		
		
	}
	
	
}

public class CountedSemaphors {
	
	public static void main(String[] args) {

		MyCountingSemaphore semaphore =new MyCountingSemaphore();
		
		Thread sender =new Thread() {
			
			@Override
			public void run() {

				int count =1;
				
				while(count<=5) {
					
					semaphore.take();
					count++;
				}
				
				
			};
		};
		
		
		
		Thread receiver =new Thread() {
			
			@Override
			public void run() {

				int count =1;
				
				while(count<7) {
					try {
						semaphore.release();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println("doing some work.... "+count);
					count++;
				}
				
				
			};
			
		};
		
		sender.start();
		receiver.start();
		
		
	}
	
	

}













