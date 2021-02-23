package generics_arrayList_methods;

import java.util.ArrayList;

public class Other_methods {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();

        name.ensureCapacity(30);



        for (int i = 0; i <30 ; i++) {

            String a="my name is ";
            String b=String.valueOf(i);
            String v =a+b;
            name.add(i,v);

        }

        System.out.println(name);

        System.out.println(name.get(28));

        System.out.println(name.size());


    }
}
