package threads.concurrency_design;

import java.util.HashMap;

public class SharedState {
	
	public static void main(String[] args) {

		HashMap<Integer,Object> map =new HashMap<>();
		
	// the two threads use the same object map 
		
		Thread addEvenNum =new Thread(){
			
			public void run() {
				
				Object value =null;
				
				for (int i = 0; i < 50; i++) {
					
					if(i%2==0) map.put(i, value);
					}
				
				
			}
		};
			
		
		Thread addOddNum =new Thread() {
			
			
	public void run() {
				
				Object value =null;
				
				for (int i = 100; i > 50; i--) {
					
					if(i%2!=0) map.put(i, value);
					}
				
				
			}
		};
		
		
		addEvenNum.start();
		addOddNum.start();
		
		
		try {
			
			Thread.sleep(4L*1000L);
		}catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println(map.toString());
	}

}
