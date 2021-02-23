package interfaces.interfaces_again.interfaces_universal_method;

public class Main {
    public static void main(String[] args) {

        DeductMe d1 = new DeductMe(55, 67);
        DeductMe d2 = new DeductMe(123, 67);

        AddMe ad1 = new AddMe(435, 87);
        AddMe ad2 = new AddMe(55, 8);


        outDeduction(d1);
        outDeduction(d2);


        outAddition(ad1);
        outAddition(ad2);


    }

    public static void outDeduction(Deducter deductMe) {


    } //universal method takes any object of classes that implement Deducter

    public static void outAddition(Adder addSome){

    }
    ////universal method takes any object of classes that implement Adder
}



