package interfaces.interfaces_again.interface_extens_impl;

public class Main {
    public static void main(String[] args) {
         Derived instance =new Derived();
         instance.method();   //from 1
         instance.method1();//from 2
         instance.method2();//from derived


        Base instance1=(Base)instance;
        Inter1 instance2=(Inter1)instance;
        Derived instance4=(Derived)instance1;
        Inter2 instance3=(Inter2)instance;

        instance1.method2(); //from base
         instance2.method();// 1
         instance3.method1();//2
        instance4.method2();




    }
}
