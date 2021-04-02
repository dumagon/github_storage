package threads;

import java.util.ArrayList;

public class CocurrentThreadError {
	
	public static void main(String[] args) {

		ArrayList<Integer> arr =new ArrayList<>();
		
		
		
	
		
		Thread readArray =new Thread() {
		
		public void run() {
			
	for (Integer integer : arr) {
				
				System.out.println(integer);
				}
			}
		
		};
		
		
		Thread writeArray =new Thread() {
			
			public void run() {
				
				for (int i = 0; i<10; i++) {
					
					arr.add(i);
					
				}
				
			}
			
			
		};
		
		
		writeArray.start();
		
	// wait for write thread to fill  up the array  	
	//	try {Thread.sleep(3L*1000L);}catch(InterruptedException e) {e.printStackTrace();}
		
		readArray.start();
		
		
		
		
	}

}

// this error randomly  occurs

//Exception in thread "Thread-0" java.util.ConcurrentModificationException
//at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//at threads.CocurrentThread$1.run(CocurrentThread.java:19)
























