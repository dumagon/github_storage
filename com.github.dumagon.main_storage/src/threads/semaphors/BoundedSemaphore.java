package threads.semaphors;

class MyBoundedSemaphore{
	
	private int signals=0;
	private int bound=0;
	
	public MyBoundedSemaphore(int bound) {
		
		this.bound=bound;
		
	}
	
	public synchronized void take() throws InterruptedException{
		
		while(signals==bound) {
			
			this.wait();
			
			System.out.println(" was waiting for the signals to be released , bound="+bound);
		}
		this.signals++;
		System.out.println("signalled");
		this.notify();
	}
	
	
	
	public synchronized void release() throws InterruptedException{
		
		while(signals==0) this.wait(); 
		signals--;
		this.notify();
	}
	
	
	
	
	
}




public class BoundedSemaphore {
	
	public static void main(String[] args) {

	MyBoundedSemaphore semaphore =new MyBoundedSemaphore(5);
		
		Thread sender =new Thread() {
			
			@Override
			public void run() {

				int count =1;
				
				while(count<15) {
					
					try {
						semaphore.take();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					count++;
				}
				
				
			};
		};
		
		
		
		Thread receiver =new Thread() {
			
			@Override
			public void run() {

				int count =1;
				
				while(count<20) {
					try {
						semaphore.release();
						
						System.out.println("released");
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


























