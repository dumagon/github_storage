package threads;



public class Threads9 {
public static void main(String[] args) {
	
	Runnable runnable = ()->{
		
		for(int i =0;i<5 ;i++){
			
			System.out.println("Running");
			
		}
		
};


Thread thread =new Thread(runnable);

thread.setDaemon(true);
thread.start();

try {
	
	thread.join();                                                                                 // Main thread is going to wait till thread " thread" dies to exit 
	
	} catch (Exception e) {
	e.printStackTrace();
}




}
	
	

}


















