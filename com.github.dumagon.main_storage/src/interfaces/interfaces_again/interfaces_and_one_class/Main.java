package interfaces.interfaces_again.interfaces_and_one_class;

public class Main {

    public static void main(String[] args) {

        OneClass instance=new OneClass();
        instance.one();
        instance.three();
        instance.two();

        One instanceUp1=instance; //methods two and three can not be summoned because
        instanceUp1.one();  //instanceUp1 operates through interface One that does not have two and three

        Two instanceUp2=instance;//respectively
        instanceUp2.two();


        Three instanceUp3=instance;//respectively
        instanceUp3.three();

    }
}
