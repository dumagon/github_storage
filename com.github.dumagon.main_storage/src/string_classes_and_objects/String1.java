package string_classes_and_objects;

public final class String1 {
	
	
	
	public static void main(String[] args) {
		
		Boolean c =true;
		String result ="this is "+c;
		System.out.println(result);
		
		String a ="wake up";                                 //this creates a string object in the string pool 
		String b ="wake up";                               // this creates another reference for the previously created string
		
		System.out.println(a==b);    
		
	
		
		
	
		

	
		
	    String string2=new String();
	    
	    string2="string";
	    
	    String newst =" is cool";
	    String newst1 ="ytring";
	    String newst2 ="string";
	    
	
	   // some methods of String 
	 
	   System.out.println(string2.charAt(0));
	   
	   System.out.println(string2.codePointAt(0));
	  
	   System.out.println(string2.codePointCount(0, 3));
	   
	   System.out.println(string2.concat(newst));
	   
	   System.out.println(string2.compareTo(newst));
	   System.out.println(string2.compareTo(newst1));
	   System.out.println(string2.compareTo(newst2));
	   
	   
	   
	   
	   
	  
	   
	   
	   
	
		
		
	
		
		
		
		
	}

}
