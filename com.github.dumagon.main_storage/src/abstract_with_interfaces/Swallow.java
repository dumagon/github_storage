package abstract_with_interfaces;

public class Swallow extends Bird{
    @Override
    void move() {
        System.out.println("can fly");

    }

    @Override
    public void live() {

        System.out.println("I live");
    }
}
