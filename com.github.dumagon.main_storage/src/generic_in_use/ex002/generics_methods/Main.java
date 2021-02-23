package generic_in_use.ex002.generics_methods; 


class MyClass{
	
	public <T> void method(T argument) {                            // ' T'  here means the method takes any type of objects   
		
		T varaible=argument;
		
		System.out.println(varaible);
	}
	
}




public class Main {
	
	public static void main(String[] args) {
		
		MyClass instance =new MyClass();
		
		instance.method("Hello World !");                //   with' T'  type  we can pass any object to the method  
		instance.method(34);

	}

}
