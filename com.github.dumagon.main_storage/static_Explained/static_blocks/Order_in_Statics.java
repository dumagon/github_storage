package static_Explained.static_blocks;

class NonStat{

    NonStat(){

        System.out.println("NonStatic");


    }
    static{
        System.out.println("static block");
    }

    static void goStat (){

        System.out.println("go static");
    }

    void go_unst(){
        System.out.println("go nonsta ");
    }
}

public class Order_in_Statics {
    public static void main(String[] args) {

        NonStat ns =new NonStat();
        ns.go_unst();
        NonStat.goStat();
    }
}
                /*static block
                NonStatic
                go nonsta
                go static
                */