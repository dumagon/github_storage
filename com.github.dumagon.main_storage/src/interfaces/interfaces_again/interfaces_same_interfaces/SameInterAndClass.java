package interfaces.interfaces_again.interfaces_same_interfaces;

interface  Inter{
    void method();
}

interface InterSub{
	
	void method(int a);
}

class Base {


    
    public void method() {
        System.out.println("implemented");
    }
}

class Child extends Base implements Inter,InterSub{
	
	public void method(int a) {
		
		System.out.println(a);
	}
	
	
}//no need to implement the interface 'method' it already exists in Base and  it has the same name and  parameters 

public class SameInterAndClass {
    public static void main(String[] args) {

        Child child=new Child();
        child.method();



    }
}
