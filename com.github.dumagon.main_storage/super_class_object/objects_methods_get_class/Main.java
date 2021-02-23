package super_class_object.objects_methods_get_class;

public class Main {

	public static void main(String[] args) {
		
		
		Car car =new Car(200,"blue");
		
		System.out.println(car.getClass());
		System.out.println(car);
		


	

		
		
		

	}


}

class Car{
	
	private int speed;
	
	private String color;
	
	
	Car(int speed,String color){
		
		this.color=color;
		this.speed=speed;
		
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		
		return String.format(" Speed is  %d   \n  Color is %s", speed,color);
		
}
	
	
		
		}
	
	
	

