package nested_and_inner_classes.inner_inheritance;

class Some {



    public class SubInner extends SuperOuter{

        public void fromSub (){

            System.out.println("hi from Sub high !");
        }

        /** inner classes can subclass classes that the outer class does not subclass
         *
         */


    }
}

public class Main {

    public static void main(String[] args) {
         Some.SubInner instance =new Some().new SubInner();


         instance.fromSub();
         instance.fromSuper();
         instance.someAdd(4, 5);



    }
}
