package interfaces.interfaces_again.interfaces_same_interfaces;

interface Inter1{
    void method();
}

interface Inter2{
    void method();
}

class Implementer implements Inter1,Inter2 {


    @Override
    public void method() {

        System.out.println("Same 1/2");

    }
}




public class SameInters {

    public static void main(String[] args) {

        Implementer impl =new Implementer();

        impl.method();

        Inter1 int1=impl;
          int1.method();

          Inter2 int2=impl;
          int2.method();

    }
}
