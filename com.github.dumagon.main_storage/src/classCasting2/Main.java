package classCasting2;

public class Main {

    public static void main(String[] args) {

        Derived instance =new Derived();
        instance.method();
        instance.method1();
        instance.method2();


        Base instanceUp=(Base)instance;
        instanceUp.method();
        instanceUp.method1();

        Derived instanceDown=(Derived)instanceUp;

        instanceDown.method();
        instanceDown.method1();
        instanceDown.method2();
    }
}
