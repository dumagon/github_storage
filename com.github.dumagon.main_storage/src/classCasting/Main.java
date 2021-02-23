package classCasting;

public class Main {
    public static void main(String[] args) {

        DerivedClass instance = new DerivedClass();
        instance.field1=2;
        instance.field2=3;
        instance.field3=4;
        instance.field4=5;
        instance.field5=6;

        BaseClass new_instance=(BaseClass)instance;

        System.out.println(new_instance.field1);
        System.out.println(new_instance.field2);
        System.out.println(new_instance.field3);
//        System.out.println(new_instance.field4);  can not resolve these variables cuz they do not exist in the
//        System.out.println(new_instance.field5);  BaseClass (new_instance belongs to the BaseClass)


        //we are using hash codes  below to see the identification numbers  of the two objects

        System.out.println("instance id "+instance.hashCode());
        System.out.println("new_instance "+new_instance.hashCode());

    }
}
