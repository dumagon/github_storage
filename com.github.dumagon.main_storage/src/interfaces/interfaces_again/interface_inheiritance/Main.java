package interfaces.interfaces_again.interface_inheiritance;

public class Main {

    public static void main(String[] args) {
        SomeClass instance =new SomeClass();
        instance.method_interface();
        instance.method_class();
        System.out.println(instance.publicField);


        SomeInterface instanceUp =instance;
        instanceUp.method_interface();

        SomeClass instanceDown=(SomeClass)instanceUp;

        instanceDown.method_interface();
        instanceDown.method_class();



    }
}
