package threads.safety;

class ImmutableClass{
	
	// this field is immutable since no setter was created 
	
	int immutableValue=0;
	
	public ImmutableClass(int value) {
		
		
		this.immutableValue=value;
	}

	public int getImmutableValue() {
		return immutableValue;
	}
	
	
	public ImmutableClass add(int val) {
		
		return new ImmutableClass(this.immutableValue+val);
		
	}

	
}

class Calculator{
	
	
	// this reference is not immutable , although the object it refers to is immutable 
	
	ImmutableClass currentValue=null;

	public ImmutableClass getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(ImmutableClass newValue) {
		this.currentValue = newValue;
	}
	
	public void add(int newInt) {
		
		this.currentValue=currentValue.add(newInt);
	}
	
	
}



	
	




public class Immutability {
	
	public static void main(String[] args) {

		Calculator cal=new Calculator();
		
		Thread a = new Thread() {
			public void run() {
				
				cal.add(4);
				
			}
		};
		
		Thread b = new Thread() {
			public void run() {
				
				cal.add(3);
				
			}
		};
		
		
	}
	

}













