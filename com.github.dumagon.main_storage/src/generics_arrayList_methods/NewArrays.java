package generics_arrayList_methods;

import java.util.ArrayList;
import java.util.List;

public class NewArrays {
    public static void main(String[] args) {


        Go s1=new Go(8);
        Go s2=new Go(9);
        Go s3=new Go(6);

         List<String> test=new ArrayList<>();
         List<Integer> newInt =new ArrayList<>();
         List<Go> newObj=new ArrayList<>();



         test.add("Hello");
         test.add("boy");
         test.add("how ur you?");

         test.add(1,"bro");

         test.remove(2);

         test.remove("bro");


         newInt.add(45);
         newInt.add(4);
         newInt.add(3);

         newObj.add(s1);
         newObj.add(s2);
         newObj.add(s3);

        System.out.println(newObj);

        System.out.println(newInt);

        System.out.println(test);


        newObj.get(2).sayHello();

    }
}

class Go {

    int s;

    Go(int s){
        this.s=s;
    }

    public void sayHello (){
        System.out.println("hello "+s);
    }
}

