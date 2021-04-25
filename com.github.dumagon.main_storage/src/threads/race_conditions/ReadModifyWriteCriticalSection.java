package threads.race_conditions;

public class ReadModifyWriteCriticalSection {
	
	 static int counter=0;
	 
	// method add is the critical section , multiple threads use this code
	 
	 static void add(int value) {
		
		counter=value;
		
	}
	 
	 
	 public static void main(String[] args) {

		Thread a =new Thread() {
			
			public void run() {
				
				add(2);
			}
			
		};
				
	Thread b =new Thread() {
			
			public void run() {
				
				add(3);
			}
			
		};
		
		b.start();
		a.start();
			
		 
		
		
		try {Thread.sleep(2L*1000L);
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		System.out.println(counter); 
		 
		 
	}
	
	

}
