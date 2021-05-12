package threads.thread_local;

class MyRunnable implements Runnable{
	
	ThreadLocal<Integer> myThreadLocal=new ThreadLocal<>();
	

	@Override
	public void run() {
		
		myThreadLocal.set((int)(Math.random()*1000D));
		
		try {
			
			Thread.sleep(2000L);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(myThreadLocal.get());
		
	}
	
	
	
}




public class FullThreadLocal {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyRunnable runnable =new MyRunnable();

		Thread thr1=new Thread(runnable);
		Thread thr2=new Thread(runnable);
		
		thr1.start();		
		thr2.start();
		
		thr1.join();
		thr2.join();
		
		System.out.println("the end");
		
		
		
	}

}


















