package super_class_object.objects_methods_equals;

public class Equals {

	public static void main(String[] args) {
		
		
		Car car1 =new Car(3);
		Car car2=new Car(3);
		Car car3=car1;
		
		System.out.println(car1.equals(car2));  
		
		System.out.println(car1.equals(car3));
		
		System.out.println(car2.equals(car1));
		
	    //      this default method will compare links                                                       public boolean equals(Object obj) {
      //       so it is to be overridden                                                                                                   return (this == obj);
    //                                                                                                                                                                  }
		
		
		
		System.out.println(car1==car2);
		
		System.out.println(car1==car3);
		
		}
	
	//  operand == also compares  links of  object 
	

}

class Car{
	
	private int  id ;
	
	public Car(int id) {
		
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
