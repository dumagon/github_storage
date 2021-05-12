package threads.volatile_keyword;


class MyClass{
	
	 int years=0;                // after updating these variables will be flushed to main memory
	 int months=0;
     volatile int days=0;      // in to make other variables be flushed to main memory
                              // the volatile variable must be put after them while writing.
	
     
     public void update(int years,int months,int days) {
    	 
    	 this.years=years;
    	 this.months=months;
    	 this.days=days;
    	 
     }
     
     
     public String totalTime() {
    	 
    	 // the volatile variable must be put before the others in order to flush them to 
    	 // main memory while reading
    	 
    	 int days=this.days;       
    	 int years=this.years;
    	 int months=this.months;
    	 String total = days+" days, "+months+" months,"+years+" years ";
    	 return total;
    	 
     }
	
	
}


public class VolatileGuarantee {
	
	public static void main(String[] args) {
		
		MyClass mc =new MyClass();
		
		
		Thread t1 =new Thread() {
			
			@Override
			public void run() {

				mc.update(4, 5, 6);
				
			};
			
			
		};
		Thread t2 =new Thread() {
			
			@Override
			public void run() {
				
			String totalTime=mc.totalTime();
			System.out.println(totalTime);
				
			};
			
			
		};
		
		t1.start();
		t2.start();
		
		

	}
	
	
	

}














