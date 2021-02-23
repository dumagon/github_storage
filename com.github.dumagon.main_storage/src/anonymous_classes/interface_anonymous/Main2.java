package anonymous_classes.interface_anonymous;
interface Instance {
    void method ();
}
public class Main2 {
    public static void main(String[] args) {

        /**
         * anonymous classes can have (private,protected,public) fields
         */

        Instance myInstance =new Instance() {
          int a =1;
          private int b=2;
          protected String c = "0k";

            @Override
            public void method() {

                b=4;
                c="very ok ";
                System.out.println(a+" and  "+b+" "+c);

            }


        };
        myInstance.method();
    }
}
