package string_classes_and_objects;

import java.util.Arrays;

public class String2 {
	
	public static void main(String[] args) {
		
		/*    StringBuffer unlike String, does not create new objects  during manipulations on strings 
		 *   thus it is better to use when many changes in strings are needed for the sake of memory consumption 
		 */
		
		StringBuffer string1 =new StringBuffer("string1 ");
		StringBuffer string2 =new StringBuffer("new buffer");
		
		
		    string2.append(5);
		    string2.append("; ");
		    string2.append(false);
		    string2.append("; ");
		    string2.append(Arrays.asList(1,2,3));
		    string2.append("; ");
		    string2.append(string1);

		    System.out.println( string2); 
		    
		    // append is called on the object it was previously called upon so it can chain-called 
		    
		    string1.append(2).append(false).append(string2).append(Arrays.asList(1,3,4));
		    
		    System.out.println(string1);
		    
		    string1.reverse();
		    
		    System.out.println(string1);
		    

		
		
	}

}
