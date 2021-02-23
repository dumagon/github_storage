package anonymous_classes.get_class;

interface NewInter{ void method ();}

class NewClass{ }


public class Main {
    public static void main(String[] args) {
       

        NewClass instance1=new NewClass();

        NewInter instance =new NewInter() {
            @Override
            public void method() {
                System.out.println("from this anonymous ");
            }
        };   NewInter instance3 =new NewInter() {
            @Override
            public void method() {
                System.out.println("from this anonymous ");
            }
        };   NewInter instance4 =new NewInter() {
            @Override
            public void method() {
                System.out.println("from this anonymous ");
            }
        };

        /** we can see the class of an object using the method 'getClass'
         *  anonymous classes will be represented by a number after $ and the class in which
         *   they were created ---- ....Main$1
          */

        System.out.println(instance.getClass().toString());
        System.out.println(instance3.getClass().toString());
        System.out.println(instance4.getClass().toString());
        System.out.println(instance1.getClass());



        instance.method();
    }
}
