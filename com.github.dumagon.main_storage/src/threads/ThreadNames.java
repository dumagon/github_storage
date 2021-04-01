package threads;

public class ThreadNames {
	
	public static void main(String[] args) {

		
		Thread thread =new Thread("Tiger") {
			
			public void run() {
				
				System.out.println(" run by " + getName() );
			} 
		};
		
		
		Thread thread1=new Thread("Cat") {
			
			public void run() {
				
				System.out.println("run by "+getName());
			}
		};
		
		thread1.start();
		thread.start();
		System.out.println(thread.getName());
		System.out.println(thread1.getName());
		
		
		
		
		
		
		
	}

}
