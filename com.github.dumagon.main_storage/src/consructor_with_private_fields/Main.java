package consructor_with_private_fields;

public class Main {
    public static void main(String[] args) {
        Car3 car1=new Car3();


        car1.setMax_speed(100);     //here we use the empty constructor and setters for each variable
        car1.setModel("BMW");       //such as speed,year,model etc.
        car1.setSpeed(40);
        car1.setYear(1955);

        System.out.println(car1.getMax_speed());
        System.out.println(car1.getYear());
        System.out.println(car1.getSpeed());
        System.out.println(car1.getModel());
        System.out.println(car1);


        Car3 car2 =new Car3("OPEL",200,60,1999);

        System.out.println(car2.getMax_speed());
        System.out.println(car2.getYear());         //here we use the constructor that takes data and values
        System.out.println(car2.getSpeed());        // via this.(variable)=variable;
        System.out.println(car2.getModel());
        System.out.println(car2);









    }
}
