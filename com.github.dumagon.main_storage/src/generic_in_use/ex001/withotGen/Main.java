package generic_in_use.ex001.withotGen;



class WithoutGen{
	
	Object obj;
	
	public WithoutGen(Object obj) {
		this.obj=obj;
		
	}
	
	
	void display() {
		
		System.out.println(obj);
	}
	
	Object obj() {
		
		return this.obj;
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
		
		WithoutGen w1=new WithoutGen("Some");
		WithoutGen w2=new WithoutGen(345);
		WithoutGen w3=new WithoutGen(new Cat("Max"));
		
		w1.display();
		w2.display();
		w3.display();
		
		w1=w2;
		
		WithoutGen s =w1;
		
		System.out.println(s.obj);
		
		
		

	}

}