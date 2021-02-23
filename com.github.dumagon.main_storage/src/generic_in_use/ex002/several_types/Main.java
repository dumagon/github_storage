package generic_in_use.ex002.several_types;

class Parent{
	int a=55;
	
	public Parent() {
		
		a=44;
	}
	
	public Parent(int a) {
		
		this.a=a;
	}
	
}

class MyClass<T1,T2>extends Parent{
	
	public T1 type1;
	public T2 type2;
	
	
	public MyClass(T1 type1, T2 type2) {
		//super();
		super(45);
		this.type1 = type1;
		this.type2 = type2;
	}
	
	
	
}



public class Main {
	
	public static void main(String[] args) {
		
		MyClass<Integer,Integer> instance=new MyClass<>(567,89);
		
		MyClass<String,Float>instance2=new MyClass<>("wow",67899.6778F);
		
		System.out.println(instance.type1+"  "+instance.type2);
		System.out.println(instance2.type1+"  "+instance2.type2);
		System.out.println(instance.a);
		
		

	}

}
