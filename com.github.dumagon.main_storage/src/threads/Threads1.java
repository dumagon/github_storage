package threads;

public class Threads1 {
	
public static class MyThread extends Thread{
	
	
	
	MyThread(){}
	
	
	@Override
	public void run() {
		
		System.out.println("  is running");
		System.out.println("  stopped");
		}
	
}

public static void main(String[] args) {

	MyThread thread =new MyThread();

	
	thread.start();
	
	/*   Thread.start executes Thread.run!
	 * 
	 * 
	 */
	
	
}




}
