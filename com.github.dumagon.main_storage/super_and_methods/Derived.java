package super_and_methods;

public class Derived extends Base {


    public void method (){


////////// here super calls for a method named the same from the super class /////////////

        super.method();


        System.out.println("from Derived");
    }
}
