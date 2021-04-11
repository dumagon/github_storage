package threads.concurrency_design;

import java.util.Scanner;

public class SameThreaded {
	
	public static void main(String[] args) {

		
		boolean proceed =true;
		
		while(proceed) {
			
			Scanner scn =new Scanner(System.in);
		
			// repeated task
			
			System.out.println("pleas enter a  (any number)");
			
			int a =scn.nextInt();
			
			
            System.out.println("pleas enter b  (any number)");
			
			int b =scn.nextInt();
			
			
			//one-off task
			
			int result =add(a,b);
			
			System.out.println(result);
			
	


			System.out.println(" do you want to continue ? enter yes or no ");
			
			
			
			String response=scn.next();
			
			
			
			
			if(response.equals("no")) {
				
				proceed=false;
			}else {
				if(response.equals("yes")) {
				System.out.println("lets proceed");}else {
					
					continue;
				}
				
			}
		}	
		
		
		
	}
	
	static int add(int a,int b) {
	
		return a+b;
		
	}

}









