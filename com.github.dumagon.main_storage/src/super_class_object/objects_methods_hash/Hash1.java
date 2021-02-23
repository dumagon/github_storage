package super_class_object.objects_methods_hash;


class Car2 {
	private int speed;
	
	public Car2(int speed) {
		
		 this.speed=speed;
		
		}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

public class Hash1 {

	public static void main(String[] args) {
		
		Car2 car1=new Car2(34);                     //         Using   the  NATIVE  method 'hashCode'  we  determine  if  an object we passed to the method 
		Car2 car2=new Car2(34);                   //           is exactly the SAME object we are looking for or comparing with. 
		Car2 car3=new Car2(3);                   //             The native hashCode gives every object passed to it  its own id-number. 
		                                                             //               So two object with same fields will anyway have different hash codes.  
		                                                           //                 If we need to compare objects by their content we have to override the native method. 
		
	Car2 car4=car1;
	 
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
		System.out.println(car4.hashCode());
		
		
		
		
		
		
	
		
		
		
		
		
		
 

		
	

	}

}
