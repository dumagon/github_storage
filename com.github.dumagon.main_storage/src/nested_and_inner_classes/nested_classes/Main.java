package nested_and_inner_classes.nested_classes;

class MyClass {

    public static class Nested {

        public static void fromStatic (){

            System.out.println("far too static to me !");
        }
        /** nested (static classes can have static and non-static   methods and fields
         * while  inner (non-static) classes  can only have non-static fields !!!!!!
         */
    }
}

public class Main {

    public static void main(String[] args) {

        MyClass.Nested.fromStatic();

        /**  to invoke static methods from nested (static) classes
         *   we don't have to create objects
          */
    }
}
