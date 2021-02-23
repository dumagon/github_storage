package string_classes_and_objects;

public class String3 {
	
	public static void main(String[] args) {
		
		String numbers ="123456";

		StringBuilder string1 =new  StringBuilder(numbers);
		
		// StringBuilder has same methods StringBuffer has such as below, but works faster ,although it is not thread safe 
		
		
		string1.reverse();
		System.out.println(string1);
		string1.reverse();
		System.out.println(string1);
		
		string1.substring(0, 3);
		
		System.out.println(string1.substring(0, 3));
		// etc.
	}

}
