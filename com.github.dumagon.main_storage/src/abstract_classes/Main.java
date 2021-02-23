package abstract_classes;

public class Main {

    public static void main(String[] args) {

        Bird s=new Swallow();
        Bird o =new Ostrich();
        Bird p =new Penguin();

        s.move();
        o.move();
        p.move();

    }
}
