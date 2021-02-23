package interfaces.interfaces_again.interfaces_universal_method;

public class DeductMe implements Deducter {

    int c;
    int d;



    @Override
    public void deductSome(int c, int d) {

        System.out.println("deducter says " +(c-d));

    }


    public DeductMe(int c, int d) {
        this.c = c;
        this.d = d;

        deductSome(this.c,this.d);
    }
}
