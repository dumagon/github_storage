package inheritance.inherit_with_super;

public class Derived extends Base {

    public int der;

   public Derived(int num1,int num2){

        super(num2);     // (super) refers to a constructor in class Base

        der=num1;       //we can assign private fields of a parent class using (super)


    }
}
