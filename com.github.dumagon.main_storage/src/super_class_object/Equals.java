package super_class_object;

public class Equals {

	public static void main(String[] args) {
		
        String s1 ="Hello";    // when we create another String Hello  java does not create a new String object .  Instead , java 
                                             //  creates a new reference to the already existing object "Hello" . 
        String s2 ="Hello";
        
        boolean result=s1==s2;
        
        System.out.println(result);
        
        s1+=1;                                  // Here java has to build two objects  "Hallo1"  
        s2+=1;
        
        result=s1==s2;
        
        System.out.println(result);
        
        System.out.println(s1+" "+s2);
        

	}
	

}
