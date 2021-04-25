package threads.synchronisation;

class TwoSums{
	
	int sum1=0;
	int sum2=0;
	
	
	public void add(int val1,int val2) {
		
		// only one thread can execute synchronized blocks at a time
		
		synchronized(this) {
			
			this.sum1+=val1;
			this.sum2+=val2;
			
			System.out.println(sum1);
			System.out.println(sum2);
			
		}
		
		
	}
	
	
}



class ThreeSum {
	
	int sum1=0;
	int sum2=0;
	int sum3=0;
	
public void add(int val1,int val2,int val3) {
		
		// each thread can execute one synchronized block while other threads are executing the other two blocks
		
		synchronized(this) {this.sum1+=val1;}
		synchronized(this) {this.sum2+=val2;}
		synchronized(this) {this.sum3+=val3;}
		
		
	}
	
}


public class SynchronizedBlocks {
	
	public static void main(String[] args) {

	
	
	TwoSums two=new TwoSums();
	ThreeSum three =new ThreeSum();
	
	Thread a =new Thread() {
		
		public void run() {
			
			two.add(4, 5);
			
		
			
			three.add(2,7,9);
			
			
			
		}
		
		
		
	};
	
	
Thread b =new Thread() {
		
		public void run() {
			
			two.add(91, 57);
			
		
			
			three.add(24,77,98);
			
			
			
		}
		
		
		
	};
	
	a.start();
	b.start();
	
	
	try {Thread.sleep(2L*1000L);
	
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
	}
	
	
	}	
	

}









