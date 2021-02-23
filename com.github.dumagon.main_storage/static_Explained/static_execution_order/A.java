package static_Explained.static_execution_order;

public class A {

    {

        System.out.println(" in block 1");
    }
    static {

        System.out.println(" in  static block 1");

    }

    A(){
        System.out.println("in constructor A");
    }
    {
        System.out.println("in block 2");
    }

    public static void main(String[] args) {

        A a =new A();
        A a2=new A();


    }
}
