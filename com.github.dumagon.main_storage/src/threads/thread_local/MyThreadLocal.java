package threads.thread_local;

public class MyThreadLocal {
	
	public static void main(String[] args) {

		ThreadLocal<String>date=new ThreadLocal<>();
		
		date.set("02,11,2021");
		
		String dateReturned=date.get();
		
		date.remove();
		
	}
	

}
