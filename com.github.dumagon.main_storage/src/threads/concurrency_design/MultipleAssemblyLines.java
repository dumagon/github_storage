package threads.concurrency_design;

import java.util.ArrayList;
import java.util.List;

public class MultipleAssemblyLines {
	
	static String[] database= {"mersedes","bmw","dodge","audi"};
	
	static List<String> assembler(List a,List b){
		
		List<String> set=new ArrayList<>();
		
		if(a!=null) {set.addAll(a);}
		if(b!=null) {set.addAll(b);}
		
		
		return set;
		
	}
	
	
	
	
	public static void main(String[] args) {

		List<String> setOfCars=new ArrayList<>();
		List<String> benz=new ArrayList<>();
		List<String> caravan=new ArrayList<>();
		List<String> x5=new ArrayList<>();
		List<String> quattro=new ArrayList<>();
		
		
;
		
		
		
		  Thread workerBenz =new Thread() {
				
				public void run() {
					
					
					
					
					for (int i =0; i<database.length; i++) {
						
						String temp=database[i];
						
						if(temp.equals("mersedes"))  { 
							
							temp= temp+"-Benz";
							
							benz.add(temp);}
						
						
						
					}
					
					setOfCars.addAll(assembler(benz, caravan));
					
				}
				
			};	
		
		
			 Thread workerCaravan =new Thread() {
					
					public void run() {
						
						
						
						
						for (int i =0; i<database.length-1; i++) {
							
							String temp=database[i];
							
							if(temp.equals("dodge"))  {  
								
								temp=temp+"-caravan";
								caravan.add(temp);}
							
							
							
						}
						
					workerBenz.start();
						
					}
					
				};	
			
		
				 Thread workerX5 =new Thread() {
						
						public void run() {
							
							
							
							
							for (int i =0; i<database.length; i++) {
								
								String temp=database[i];
								
								if(temp.equals("bmw"))  {  
									
									temp=temp+"-x5";
									x5.add(temp);}
								
								
								
							}
							
							
							setOfCars.addAll(assembler(x5, quattro));
							
						}
						
					};
		
					
					 Thread workerQuattro =new Thread() {
							
							public void run() {
								
								
								
								
								for (int i =0; i<database.length; i++) {
									
									String temp=database[i];
									
									if(temp.equals("audi"))  {  
										
										temp=temp+"-quattro";
										caravan.add(temp);}
									
									
									
								}
								
							workerX5.start();
								
							}
							
						};
						
						
						
					
						
			workerCaravan.start();
			
			
			
			
			workerQuattro.start();
			
			
	try {
				
				Thread.sleep(3L*1000L);
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
					
	
	System.out.println(setOfCars.toString());
						
	}
	
	
	
	
	
	

}























