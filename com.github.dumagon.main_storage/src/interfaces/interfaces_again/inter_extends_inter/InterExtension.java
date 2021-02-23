package interfaces.interfaces_again.inter_extends_inter;


interface Inter1{
    void method1();
}

interface Inter2 extends Inter1{
    void method2();
}

class NewClass implements Inter2 {


    public void method3(){
        System.out.println("from NEW");
    }


    @Override
    public void method1() {
        System.out.println("from inter1");

    }

    @Override
    public void method2() {

        System.out.println("from inter 2");


    }
}

class Derived extends NewClass{

    @Override
    public void method3() {
        System.out.println("from DER");
    }
}

public class InterExtension {

    public static void main(String[] args) {

        NewClass newInstance=new NewClass();

        newInstance.method1();
        newInstance.method2();
        newInstance.method3();

        Inter1 newInter1=newInstance;

        newInter1.method1();
        

        Inter2 newInter2=newInstance;

        newInter2.method1();
        newInter2.method2();

         Derived newDerived=new Derived();

         newDerived.method1();
         newDerived.method2();
         newDerived.method3();
    }
}
