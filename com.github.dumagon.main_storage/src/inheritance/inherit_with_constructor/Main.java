package inheritance.inherit_with_constructor;

public class Main {

    public static void main(String[] args) {

        Derived deriving=new Derived(34,56); // We can assign public fields of a parent class using a constructor
        System.out.println(deriving.a+" "+deriving.b);//  of the derived class .
    }
}
