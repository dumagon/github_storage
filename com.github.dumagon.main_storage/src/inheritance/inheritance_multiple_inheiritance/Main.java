package inheritance.inheritance_multiple_inheiritance;

public class Main {

    Main(){

        System.out.println("main");
    }

    public static void main(String[] args) {


        C cc=new C();



    }
}

class AA extends Main{
    AA(){
        System.out.println("AA");
    }


}

class B extends AA{
    B(){
        System.out.println("B");
    }
}

class C extends B{

    C(){
        System.out.println("C");
    }
}
