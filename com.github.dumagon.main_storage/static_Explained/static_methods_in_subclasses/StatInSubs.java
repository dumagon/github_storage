package static_Explained.static_methods_in_subclasses;


class SuperClass {

    static void method (){

        System.out.println("SuperClass method");
    }

}

class Subclass extends SuperClass {

    static void method() {
    	
    	SuperClass.method();

        System.out.println("SubClass method");
    }
}

public class StatInSubs {
    public static void main(String[] args) {

   Subclass.method();
   SuperClass.method();
   
   Subclass sb =new Subclass();
   
   sb.method();

        /**  static classes can not be overridden
         *   thus , each class invokes its method
         */

    }
}
