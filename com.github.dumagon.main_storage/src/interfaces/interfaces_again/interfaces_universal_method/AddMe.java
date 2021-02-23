package interfaces.interfaces_again.interfaces_universal_method;

public class AddMe implements Adder {

    int a;
    int b;


    @Override
    public void addSome(int a, int b) {

        System.out.println(" adder says "+(a+b));

    }

    public AddMe(int a, int b) {
        this.a = a;
        this.b = b;

        addSome(this.a,this.b);
    }
}
