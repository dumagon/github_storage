package super_in_classes;

public class Cat extends Animal{


    int age;
    String name;


    Cat(int weight,String breed,int age,String name){

 ///////// super always goes first !!!!! //////////
 /////////  we use 'super to pass parameters to the super class //////////////

        super(weight,breed);
        this.age=age;
        this.name=name;

    }

}
