package threads.safety;

class LocalClass{
	
 
	// thread unsafe field
	
  boolean var =false;
	
	// thread safe method 
	
	public void someThreadSafeMethod() {
		
		LocalClass loc =new LocalClass();
		
		
		// thread safe field
		
		int local_var=0;
		
		local_var=1;
		
		printObject(loc,local_var);
		
		
		
	}
	
	// thread unsafe method 
	
	public LocalClass someThreadUnSafeMethod() {
		
		LocalClass loc = new LocalClass();
		
		loc.var=true;
		
		System.out.println(loc);
		
		return loc; //   !!!!!
		
	}
	
	private void printObject(LocalClass loc,int local_var) {
		
		System.out.println(loc+" +++ "+local_var);
		
	}
	
	
}



public class ThreadSafety {
	
	public static void main(String[] args) {

		LocalClass newlocal =new LocalClass();
		
		newlocal.someThreadSafeMethod();
		
		newlocal=newlocal.someThreadUnSafeMethod();
		
		System.out.println(newlocal);
	}
	
	

}













