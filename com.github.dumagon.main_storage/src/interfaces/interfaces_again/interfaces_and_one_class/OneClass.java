package interfaces.interfaces_again.interfaces_and_one_class;

public class OneClass implements One,Two,Three{
    @Override
    public void one() {
        System.out.println("one");

    }

    @Override
    public void three() {

        System.out.println("three");

    }

    @Override
    public void two() {

        System.out.println("two");

    }
}
