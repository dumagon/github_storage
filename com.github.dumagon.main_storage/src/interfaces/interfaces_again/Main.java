package interfaces.interfaces_again;

interface  Add {

    int method1 (int a ,int b);
}

interface Sub{
    int method (int a,int b);
}

 class Math implements Add,Sub{
     @Override
     public int method1(int a, int b) {

         int sum=0;
         sum=a+b;
         return sum;
     }

     @Override
     public int method(int a, int b) {

         int sum=0;
         sum=a-b;
         return sum;
     }
 }




public class Main {
    public static void main(String[] args) {


        Add addto =new Math();
        Sub subBy=new Math();
        Add ad =new Add() {                                                            // creating an object of the  anonymous class implementing the interface Add
            @Override
            public int method1(int a, int b) {
               return a+b;
            }
        };

        System.out.println(addto.method1(56,89));
        System.out.println(subBy.method(56,7));
        System.out.println(ad.method1(34,54));

    }
}
