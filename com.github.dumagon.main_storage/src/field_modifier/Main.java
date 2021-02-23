package field_modifier;

import pack2.ExamplePack2;
import pack2.Parent;

public class Main extends Parent{

    public static void main (String[] args) {

        ExamplePack1 a1=new ExamplePack1();

        System.out.println(a1.name2);
        System.out.println(a1.name3);
        System.out.println(a1.name4);


        ExamplePack2 b1=new ExamplePack2();


        System.out.println(b1.name4);

        Main p =new Main();

//        System.out.println(p.name1);
//        System.out.println(p.name2);
        System.out.println(p.name3);
        System.out.println(p.name4);




    }
}
