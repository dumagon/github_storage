package static_Explained.static_fields;

class Cat{
	
static	String name1 ;
	
	
public Cat (String name1) {
	
	this.name1=name1;
}
	
}

class Kitten extends Cat {
	
	
	
static String name="boo";                     ////  to be passed via   'super()'   a field must be static !!!!           ////// 
	
	 Kitten () {
		
		super(name);
	}
	
}


public class Unpassable {
	
	public static void main(String[] args) {
		
		Kitten.name="fooo";
		Kitten kitty =new Kitten();
		System.out.println(kitty.name);
		System.out.println(kitty.name1);
		
		System.out.println(Cat.name1);
		
		

	}

}
