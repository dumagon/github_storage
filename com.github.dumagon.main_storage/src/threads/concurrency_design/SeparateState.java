package threads.concurrency_design;

import java.util.HashMap;

public class SeparateState {
	
	public static void main(String[] args) {
		
		
		// here the two threads use their own maps

		HashMap<Integer,Object> mapAll =new HashMap<>();
		HashMap<Integer,Object> mapEven =new HashMap<>();
		HashMap<Integer,Object> mapOdd =new HashMap<>();
		
		
Thread addEvenNum =new Thread(){
			
			public void run() {
				
				HashMap<Integer,Object> mapLocal =new HashMap<>();
				
				Object value =null;
				
				for (int i = 0; i < 50; i++) {
					
					if(i%2==0) mapLocal.put(i, value);
					}
				mapEven.putAll(mapLocal);
				
			}
		};
		
		
Thread addOddNum =new Thread() {
			
			
			public void run() {
				
				HashMap<Integer,Object> mapLocal =new HashMap<>();
						
						Object value =null;
						
						for (int i = 100; i > 50; i--) {
							
							if(i%2!=0) mapLocal.put(i, value);
							}
						
						mapOdd.putAll(mapLocal);
					}
				};	

	addEvenNum.start();
	addOddNum.start();
	
	try {
		
		Thread.sleep(4L*1000L);
	}catch(InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
	mapAll.putAll(mapEven);
	mapAll.putAll(mapOdd);
	
	System.out.println(mapAll.toString());
				

	
	
	
	
	
	
	
	
	
				
		
	}
	
	

}








