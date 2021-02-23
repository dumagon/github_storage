package interfaces.interfaces_again.interface_inheiritance;

public class SomeClass implements SomeInterface{

    public String publicField="publicField";
    @Override
    public void method_interface() {

        System.out.println("implemented from SomeInterface");

    }


    public void method_class(){
        System.out.println("from class");
    }
}
