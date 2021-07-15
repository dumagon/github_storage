package threads.semaphors;

public class SemaphoreLock {
	
	public static void main(String[] args) throws InterruptedException {

		MyBoundedSemaphore semaphore=new MyBoundedSemaphore(1);
		
		
		Thread a = new Thread() {
			
			
			@Override
			public void run() {

				try {
					
					semaphore.take();
					
					System.out.println("signalled from a");
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} finally {
					try {
						semaphore.release();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println("released from a");
				}
				
			};
			
		};
		
		
		
		
		
Thread b = new Thread() {
			
			
			@Override
			public void run() {

				try {
					
					semaphore.take();
					
					System.out.println("signalled from b");
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} finally {
					try {
						semaphore.release();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println("released from b");
				}
				
			};
			
		};
		
		
		a.start();
		b.start();
		
		
		
	}

}
