package lambda;

interface StringFactory{
	
	public String create(char[]chars);
	
}

public class LambdaConstructorRef {
	
	
	public static void main(String[] args) {

		char[] chars= {'r','o','o','t'};
		
		StringFactory sf=String::new;
		
		String str= sf.create(chars);
		
		System.out.println(str);
		
		
	}
	

}
