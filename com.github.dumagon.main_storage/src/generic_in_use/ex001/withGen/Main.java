package generic_in_use.ex001.withGen;


class WithGen<T>{
	
	T obj;
	
	public WithGen(T obj) {
		this.obj=obj;
		
	} 
	
	
	void display() {
		
		System.out.println(obj);
	}
	
	
	
}


class Cat{
	
	String name;
	
	public Cat (String name) {
		
		this.name=name;
	}

	@Override
	public String toString() {
		
		return name;
		
		
	}
	
	
}





public class Main {
	
	public static void main(String[] args) {
		
		WithGen<String>w1=new WithGen<>("Some");
		WithGen<Integer>w2=new WithGen<>(345);
		WithGen<Cat>w3=new WithGen<>(new Cat("Max"));
		
		w1.display();
		w2.display();
		w3.display();
		

	}

}
