package inheritance.inerit_with_field_change;

public class Main {
    public static void main(String[] args) {

        DerivedClass inst=new DerivedClass();
        System.out.println(inst.publicField);
        System.out.println(inst.protectedField);
        System.out.println(inst.a);
       inst.show();

    }
}
