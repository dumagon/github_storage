package threads.concurrency_design;

import java.util.ArrayList;
import java.util.List;

public class ParallelWorkers {
	
static String[] database= {"red","blue","green","scarlet"};

public static void main(String[] args) {
	
	
	//     -> workerJoe
   // main 
  //       -> workerTom

	
	List<String> memory_state=new ArrayList<>();
	
	Thread workerJoe =new Thread("Joe") {
		
		public void run() {
			
			int joes_work =database.length/2;
			String processed=null;
			
			for (int i = 0; i < joes_work; i++) {
				
				String temp=database[i];
				memory_state.add(temp);
				
				if(processed==null) {processed=temp;}else
				{processed=processed+","+temp;}
				
			}
			
			System.out.println(getName()+" worked  "+processed);
			
		}
		
	};
	
    Thread workerTom =new Thread("Tom") {
		
		public void run() {
			
			int toms_work =database.length/2;
			String processed=null;
			
			for (int i = database.length-1; i>= toms_work; i--) {
				
				String temp=database[i];
				memory_state.add(temp);
				
				if(processed==null) {processed=temp;}else
				{processed=processed+","+temp;}
				
			}
			
			System.out.println(getName()+" worked  "+processed);
			
		}
		
	};
	
	
	
	
	
	
	
	
	workerJoe.start();
	workerTom.start();
	
	
	try {
		
		Thread.sleep(3L*1000L);
	}catch(InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
	
	System.out.println(memory_state.toString());
	
	
	
}

	
	
	
	

}
