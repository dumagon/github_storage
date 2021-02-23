package anonymous_classes.interface_anonymous;
interface MyInterface{
    void method ();
}
public class Main {
    public static void main(String[] args) {

        /**
         * here we are about to create a new anonymous class
         * not an object of the interface !!!!
          */
        MyInterface newMine =new MyInterface() {
            @Override
            public void method() {
                System.out.println(" Anonymous");
            }
        };

        newMine.method();
    }

}
