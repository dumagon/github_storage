package constructor;

public class Car {

    private String model;
    private int year;
    private int speed;
    private int MaxSpeed;


    public Car() {

    }

    public Car (int maxSpeed,int year,int speed,String model){

        this.MaxSpeed=maxSpeed;
        this.setModel(model);
        this.setYear(year);
        this.setSpeed(speed);

    }

     public int getMaxSpeed (){return MaxSpeed;}

     public void setMaxSpeed(int MaxSped){ this.MaxSpeed=MaxSped;}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
