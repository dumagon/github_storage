package null_example;

import constructor.Car;

public class Car4 {

    public static void main(String[] args) {

        String a=null;
        Car car1=null;

        System.out.println(a);
        System.out.println(car1==null);
        System.out.println(car1);
        System.out.println(car1.getMaxSpeed());//Exception in thread "main" java.lang.NullPointerException!!!!!


    }


}
