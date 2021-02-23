package final_classes_and_methods;

class A {

    public void method() {
        System.out.println("a");
    }  public void method1() {
        System.out.println("a1");
    }

}
    class B extends A{

       public final void method(){
           System.out.println("b");
       }  public void method1(){
           System.out.println("b1");
       }
    }

    class C extends B{
    public void method1(){
        System.out.println("c");
    }


}
public class Main2 {
    public static void main(String[] args) {

        C cc=new C();
        cc.method();
        cc.method1();

    }
}
