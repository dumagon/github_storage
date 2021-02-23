package static_Explained.statics;


class NoneStatic {

    int a;
    static int b;

    NoneStatic(int id) {
        this.a = id;
    }

    void calc() {
        System.out.println(a + b);
    }

    static void staticCalc() {

//        System.out.println(a+b)!!!!!!!;  static methods cannot invoke non static fields    111   }
    }
}

public class Statics {

    public static void main(String[] args) {

        NoneStatic n1=new NoneStatic(4);
        NoneStatic n2=new NoneStatic(5);

        n1.calc();
        n2.calc();

        NoneStatic.b=23;

        n1.calc();
        n2.calc();


    }
}
