package static_Explained.static_fields;

public class Car {
    String model;
    String color;

    static int serial_number;

    public static void main(String[] args) {


        do{
            Car.serial_number+=1;
            System.out.println("new car n  "+serial_number);
        }while (serial_number<10);





        Car.serial_number=1;
        Car.serial_number=2;
        Car.serial_number=100;

        System.out.println(Car.serial_number);



        }

    }


