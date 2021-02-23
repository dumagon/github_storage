package generics_wildcards;



import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {

        List<Animal>myAnimals =new ArrayList<>();

        Animal an =new Animal(67,45,"sad");


        myAnimals.add(an);
       myAnimals.add(new Animal(52,56,"happy"));
        myAnimals.add(new Animal(45,57,"indifferent"));

        Animal an2 =myAnimals.get(1);
        System.out.println( myAnimals.toString());
        System.out.println(an2);

        System.out.println(myAnimals.get(0).id+" "+myAnimals.get(1).ur+" "+myAnimals.get(2).name);



        test(myAnimals);


        List<Dog>myDogs=new ArrayList<>();
        myDogs.add(new Dog());
        myDogs.add(new Dog());

        test(myDogs);

        System.out.println((newAny(myAnimals.get(0),myAnimals.get(1),myAnimals.get(2)).id));
        System.out.println((newAny(myAnimals.get(0),myAnimals.get(1),myAnimals.get(2)).ur));
        System.out.println((newAny(myAnimals.get(0),myAnimals.get(1),myAnimals.get(2)).name));




    }

//    private static void test (List<Animal>List){
    private static void test (List<? extends Animal> beast){

        // -------now we can take any list of classes that extend Animal------

        for (Animal animal:beast){

            animal.eat();
            System.out.println(animal.ur);
            System.out.println(animal.name);
            System.out.println(animal);}


    }

   public static Animal newAny (Animal n1,Animal n2,Animal n3){



        Animal beast =new Animal(n1.id+n2.id,n1.ur+n2.ur,n2.name+"-"+n3.name);
        return beast;
    }


}
