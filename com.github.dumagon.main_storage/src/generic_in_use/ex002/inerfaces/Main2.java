package generic_in_use.ex002.inerfaces;

 class Shape1  {
	 
	 String a=" drawable";
	 
	  String showMe() {
		  
		  return a;
	  }
	 
	 String method() {
		return Cone.display();
		 
	 }
	

}
                                                                                                                                   //                                             the figures'   section  
class Cone extends Shape1 {
	
	static String view ="cone";
	
	  static String display() {
		
		return view;
	
	}
	  
	  public String toString() {
		  
		  return view;
	  }
	// @Override 
	  public String showMe() {
		  
		  return view;
		
	}
}




interface  IContainer1 <T>{
	
	T getFigure();
	
	void setFigure(T figure);

	
	}

 class Container1 <T> implements IContainer1<T>{
	 
	private  T figure;
	 
	 

	public Container1(T figure) {
		
		this.figure = figure;
	}
	
	
	                                                                                                                                                                              // the containers'  section
	
	
	@Override
    public T getFigure() {
		return figure;
	}

	
	
	@Override
	public void setFigure(T figure) {
		
		this.figure=figure;
		
	}

}



public class Main2 {
	
	public static void main(String[] args) {
		
		Cone cone =new Cone();
		
		
		
		
		
		
		
		IContainer1<Shape1> conic_box=new Container1<>(cone);
		
		      //  now , conic_box  is a container that has the field  'figure'    
		   //    the value  of   this figure will be an upcast to 'Shape' 
		//      object of the class Cone  since the type of the parameter we pass to the constructor  is 'Shape1' 
		
		System.out.println(conic_box);
		
		
		System.out.println(conic_box.getFigure().method());
		System.out.println(conic_box.getFigure());
		System.out.println((conic_box.getFigure()).showMe());
	
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
                                            



































































