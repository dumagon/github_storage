package interfaces.interfaces_again.parameterized;
interface MyProducer<T>{
	
	T produce();
	
	String make();
	
	
	
}

class Car{};

class MyCarFactory implements MyProducer<Car>{
	
	private int produced_cars;
	private long valueOfCompany=56677777766666L;
	public int foundationYear=1989;
	

	@Override
	public Car produce() {
		//int cars=produced_cars;
		setProduced_cars(produced_cars+1);
		return new Car();
		
		
		
	}

	public int getProduced_cars() {
		return produced_cars;
	}

	public void setProduced_cars(int produced_cars) {
		this.produced_cars = produced_cars;
	}

	public long getValueOfCompany() {
		return valueOfCompany;
	}

	public void setValueOfCompany(long valueOfCompany) {
		this.valueOfCompany = valueOfCompany;
	}

	@Override
	public String make() {
		
		return "only strings";
	}
	
	
	
	
	
}
public class Main {
	
	
public static void main(String[] args) {
	
	MyCarFactory a=new MyCarFactory();
	
	a.produce();
	a.produce();
	a.produce();
	System.out.println(a.getProduced_cars());
	System.out.println(a.getValueOfCompany());
	System.out.println();
	
	
	MyProducer<Car> b=new MyCarFactory();
	
  b.produce();
  System.out.println(b.make());
	

}
	
	
	

}

















