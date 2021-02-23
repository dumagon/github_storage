package nested_and_inner_classes.inner_classes;

class Container {  // TOP-LEVEL-CLASS  or  OUTER

    public class Inner { // INNER NON-STATIC CLASS

        /** inner classes can have an access modifier such as private , protected
         * also inner classes can be static
         *
         * outer classes can be public but only one  ,and packaged
          */


        public void method (){

            System.out.println(" hi from inner fry !");
        }


    }



}

public class Main {
    public static void main(String[] args) {
        Container.Inner instance=new Container().new Inner();

        instance.method();
    }
}
