package file_reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BingeReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("C:/Users/zackn/Desktop/test.txt");
		
		
			
		try {	
			
			Scanner scan =new Scanner(file);
			
			while(scan.hasNext()) {
			
			
			for(int i=0;  i<3;  i++) {
				
				
				System.out.print(" "+scan.next());
				
				}
			System.out.print(" \n");
			
			
			}
			
			scan.close();
			
		}catch(Exception e) {
			
		
		System.out.print("\n  The end of the story");
		
		System.out.println(e.getCause());
		
		
			
			
			
		}
			
		
		
		
		
		
		

	}

}
