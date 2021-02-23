package generic_in_use.ex002.inerfaces;

abstract class Shape{}

class Circle extends Shape{
	
	public String toString() {
		return "Circle";
		
		
	}
		
		
	}




interface IContainer <T>{
	
	T getFigure();
	
	void setFigure(T figure);
	
}

class Container <T>implements IContainer<T>{
 
	T figure;
	
	
	
	

	public Container(T figure) {
		
		this.figure = figure;
	}

	@Override
	public T getFigure() {
		
		
		return figure;
	}

	@Override
	public void setFigure(T figure) {
		
		this.figure=figure;
		
	}
	
	
}



public class Main {
	
	public static void main(String[] args) {
		
	Circle circle =new Circle();
	
	IContainer<Circle>new_container =new Container<>(circle);

	
	
	
	System.out.println(new_container.getFigure().toString());
	
		
		
		

	}

}
