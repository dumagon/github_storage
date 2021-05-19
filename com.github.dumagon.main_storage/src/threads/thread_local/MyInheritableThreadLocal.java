package threads.thread_local;

public class MyInheritableThreadLocal {
	
	public static void main(String[] args) {
		
		ThreadLocal<String> myThreadLocal=new ThreadLocal<>();
		InheritableThreadLocal<String> myInheritableThreadLocal=new InheritableThreadLocal<>();

		
		Thread thr1 =new Thread() {
			
			@Override
			public void run() {

				
				
				System.out.println("Parent thread");
				
				myThreadLocal.set("value 1 ");
				myInheritableThreadLocal.set("value 1.1");
				
				System.out.println("parent "+myThreadLocal.get());
				System.out.println("parent " +myInheritableThreadLocal.get());
				
				Thread child =new Thread() {
					
					@Override
					public void run() {

						System.out.println("Child");
						System.out.println("child "+myThreadLocal.get());
						System.out.println("child " +myInheritableThreadLocal.get());
						
						
						
	};
					
					
					
					
				};
				
				child.start();
				
				
				
			};
			
			
			
			
		};
		
		
		
		
		
Thread thr2 =new Thread() {
			
			@Override
			public void run() {
				
				

			

						System.out.println("Other thread");
						System.out.println("other "+myThreadLocal.get());
						System.out.println("other "+myInheritableThreadLocal.get());
						
				
			
			};
			
		};
		
		
		thr1.start();
		
		thr2.start();
		
	}

}
