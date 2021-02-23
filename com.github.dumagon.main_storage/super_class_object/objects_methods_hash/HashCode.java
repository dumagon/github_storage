package super_class_object.objects_methods_hash;

public class HashCode {

	public static void main(String[] args) {
		
		Car car =new Car ();
		
		
		System.out.println(car.hashCode());    ///   hash codes of the same objects are also the same 
		
		
		
		Car car2=new Car(3);
		Car car3=new Car(4);

		System.out.println(car2.hashCode());       // hash codes of different objects are also different 
		System.out.println(car3.hashCode());   //  if hash code of different objects are the same it is called "collision"!!!!! 
		
		
		

	}

}


class Car extends Object{  
	
	int a;
	
	Car(){};
	
	
	Car(int a){
		
		this.a=a;
		
		
	}
	
}

