package abstract_classes;

//////////////// an interface is a set of abstract methods an implementing class has to override ///////////

interface Animal{
    int a=2;
    void live();
}

 class Dog implements Animal{


     @Override
     public void live() {

         System.out.println("dogs live");

     }
 }

 ////////// abstract class is more a conception or idea rather than an object //////////////////
/////////// but it is still  a class ,only an object of this class can not be created !!!!! ///////////

 abstract class Animal1{
    void eat(){
        System.out.println("I eat");
    }

    abstract void havingAname();
 }

 class Cat extends Animal1{


     @Override
     void havingAname() {

         System.out.println("My name is Cat");

     }
 }

public class Classes_vs_Interfaces {
    public static void main(String[] args) {

        Dog MyDog =new Dog();
        System.out.println(MyDog.a);
        MyDog.live();


        Cat kitten =new Cat ();
        kitten.eat();
        kitten.havingAname();


    }
}
