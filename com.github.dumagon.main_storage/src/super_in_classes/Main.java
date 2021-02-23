package super_in_classes;

public class Main {

    public static void main(String[] args) {

        Cat cat =new Cat(2,"Russian blue",1,"Buddy");
        Cat kitty =new Cat(4,"macoon",3,"Steve");

        System.out.println("age: ("+cat.age+") name: ("+cat.name+") weight: ("+cat.getWeight()+") breed : ("+cat.getBreed()+")");
        System.out.println("age: ("+kitty.age+") name: ("+kitty.name+") weight: ("+kitty.getWeight()+") breed : ("+kitty.getBreed()+")");
    }
}
