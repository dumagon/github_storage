package invisible_class_object_and_tostring;

public class Main extends Object{// every class in java extends the class Object

    public static void main(String[] args) {

        Human h1 =new Human(44,"Bob");
        System.out.println("\n"+h1);//will give us its hash code Human@2f4d3709
        System.out.println(h1.toString());
        // toString method is not shown but it is here cuz it is one of the methods of the class Object

        Animal a1 =new Animal(3,"Ruby");

        System.out.println(a1.toString());
        //will give us Ruby 3 cuz the original method was overridden in the class Animal

    }
}

 class Human extends Object{ //same here
    private int age;
    private String name;

    public Human (int age,String name){

        this.age=age;
        this.name=name;
    }

}
class Animal extends Object {
    private int age;
    private String nickname;


    @Override
    public String toString (){  //we override the original toString method
        return nickname+" "+age;
    }

    public  Animal (int age,String nickname){
        this.age=age;
        this.nickname=nickname;
    }


}
