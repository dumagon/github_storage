package threads.semaphors;

class SendingThread extends Thread{
	
	MySemaphore semaphore =null;
	
	public SendingThread(MySemaphore semaphore) {
		
		this.semaphore=semaphore;
	}
	
	
	
	public  void  run() {

	
			
			System.out.println("I'm sending a signal");
			
			this.semaphore.take();
			
	

	};
	
	
}

class ReceivingThread extends Thread {
	
	MySemaphore semaphore=null;
	
	public ReceivingThread(MySemaphore semaphore) {
		
		this.semaphore=semaphore;
	}
	
	
	
	public void run() {
		
		
		
		try {
			this.semaphore.release();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(" the signal was released");
		
		
	};
	
	
}


public class LetsSignal {
	
	public static void main(String[] args) {

		
		MySemaphore semaphore =new MySemaphore();
		
		SendingThread sender=new SendingThread(semaphore);
		ReceivingThread receiver =new ReceivingThread(semaphore);
		
		
		receiver.start();
		sender.start();
		
		
		
		
	}
	
	

}













