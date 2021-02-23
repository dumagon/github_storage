package constructors_overload;

public class Main {

    public static void main(String[] args) {

        Animal animal=new Animal();

        System.out.println(animal.getAge()+" "+animal.getHeight());

        Animal animal1 =new Animal(20);

        System.out.println(animal1.getAge()+" "+animal.getHeight());

        Animal animal2=new Animal(45,78);

        System.out.println(animal2.getAge()+" "+animal2.getHeight());




    }
}
