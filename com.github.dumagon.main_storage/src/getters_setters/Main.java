package getters_setters;

public class Main {

    public static void main(String[] args) {

        Shape a =new Shape();

        a.square=40.54;
        System.out.println(a.square);


        a.setHeight(10000000);
        a.getHeight();

        a.setLength(40);
        a.getLength();

        a.view();
        System.out.println(a);
    }



}
