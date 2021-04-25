package threads.synchronisation;


class Values{
	
	int a;
	int b;
	int c;
	
	public Values(int a,int b,int c) {
		
		
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
}

class ValuesExchanger{
	
	private int v1;
	private int v2;
	private int v3;
	
	
	
	
	public void setVal(Values values) {
		
		this.v1=values.a;
		this.v2=values.b;
		
		// after executing the synchronized block all the data will be flushed to main memory 
		
		synchronized (this) {
			this.v3=values.c;
		}
		
		
		
		
	}
	
	
	public void getVal(Values values) {
		
		// after reading the synchronized block the data will be refreshed from main memory 
		
		synchronized (this) {
			
			values.c=this.v3;
			
		}
		
		values.a=this.v1;
		values.b=this.v2;
		
		
	}
	
	
	
	
}








public class HappensBeforeGuarantee {
	
	public static void main(String[] args) {

	Values val1 =new Values(3,5,33);
	Values val2 =new Values(34,45,330);
	
	
	
	
	Thread th =new Thread() {
		
		public void run() {
			
			ValuesExchanger vs =new ValuesExchanger();
			
			vs.setVal(val1);
			
			vs.getVal(val2);
			
			
		}
		
	};
	
	
	th.start();
	
	
    try {
   	    Thread.sleep(2L*1000L);
	
       } catch (Exception e) {
	    e.printStackTrace();
}
	
   
    

	System.out.println(val2.a+" "+val2.b+" "+val2.c);

		
	}

}











