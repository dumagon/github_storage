package consructor_with_private_fields;

public class Car3 {

    private  String model;
    private int max_speed;
    private int speed;
    private int year;

    public Car3 (){}

    public Car3 (String model,int max_speed,int speed,int year){

        this.model=model;
        this.max_speed=max_speed;
        this.speed=speed;
        this.year=year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
