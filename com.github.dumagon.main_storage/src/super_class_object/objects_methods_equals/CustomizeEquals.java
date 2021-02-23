package super_class_object.objects_methods_equals;

class Car1{
	
	private int  id ;
	
	public Car1(int id) {
		
		this.id=id;
	}
	
   public int getId() {
		return id;
	}

   public void setId(int id) {
		this.id = id;
	}
   



   public boolean equals(Object obj) {
	   
	   /////                in case              car1.equals(car2)  
		
		if (this==obj) 	return true;                //                           checking  if we are comparing  an object with itself                        car1==car2               
		
		
		if(obj==null || getClass()!=obj.getClass()) return false;     ///   car2==null ||  car1.getClass!=car2.getClass 
		
		                                                                                                    ///  checking that we are not comparing with null   and that both objects are of the same class 
		
		 
	     Car1 car =(Car1) obj;
	
	    if(id != car.id) return false;                                 ///  comparing fields we want our objects to be compared by  
	                                                                                  ///    we can specify any field and compare two objects by them 
	                                                                                ///  thus they can be not truly equal if we didn't use  hashCode method with it  
	     return true;
		}
	

}

public class CustomizeEquals {

	public static void main(String[] args) {
		
		
		Car1 car1 =new Car1(3);
		Car1 car2=new Car1(3);
		
		
		System.out.println(car1.equals(car2));
		System.out.println(car2.equals(car1));
		
	
		
		
		
		}
}

