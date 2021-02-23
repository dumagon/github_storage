package anonymous_classes.methods;



interface Instance {
    void method ();
    int getValue ();

}

public class Main1 {

    public static void main(String[] args) {


        Instance instance1 =new  Instance(){

            protected int a =0;

            @Override
            public void method() {

                a=200;


            }

            @Override
            public int getValue() {
                return a;
            }
        };
         Instance instance2 =new  Instance(){

            protected int a =0;

            @Override
            public void method() {
               a=instance1.getValue();


            }

            @Override
            public int getValue() {
                return a;
            }
        };

         instance1.method();
         instance2.method();

        System.out.println(" from 1 - "+instance1.getValue()+" from 2 - "+instance2.getValue());

    }
}
