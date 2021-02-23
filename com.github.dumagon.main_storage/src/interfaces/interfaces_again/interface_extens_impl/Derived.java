package interfaces.interfaces_again.interface_extens_impl;

public class Derived extends Base implements Inter1,Inter2{
    @Override
    public void method() {

        System.out.println("from inter 1");

    }

    @Override
    public void method1() {

        System.out.println("from inter 2");

    }
    @Override

    public void method2(){
        System.out.println("from derived");
    }

    public void boo (){

    };


}
