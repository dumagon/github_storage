package lambda;

interface Printer{    public void printString(String string);}

interface Finder{public void find(String a,String b);}

class FindString{
	
	static void doFind(String a,String b) {
		
		
		System.out.println(a.lastIndexOf(b));
	}
	
	
	
}



public class LambdaRef {
	
	public static void main(String[] args) {

		
		// lambda method reference  
		
		Printer pr =System.out::println;
		
		// normal lambda expression
		
		Printer pr1 = param -> System.out.println(param);
		
		pr.printString("too");
		
		pr1.printString("boo");
		
		
		// lambda static method reference
		
		Finder finder =FindString::doFind;
		
		finder.find("go there now ", " ");
		
		
		
		
		
		
		
		
	}
	
}


