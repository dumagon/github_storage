package generics_arrayList_methods;

import java.util.ArrayList;
import java.util.List;

public class ListMy {
    public static void main(String[] args) {

        List<Integer> lst =new ArrayList<>();



        lst.add(12);//adds one element
        ///////////

        System.out.println(lst.get(0));
                          ////////////

        System.out.println(lst.toString());


        lst.add(0,34);
        /////////
        // adds one element at the index if there is already another element , pushes it further to the end

        System.out.println(lst.toString());

        lst.set(0,67);//sets
        ////////////

        System.out.println(lst.toString());

        System.out.println(lst.size());//shows size
                           //////////

        System.out.println(lst.indexOf(67));//shows index
                           /////////////


        System.out.println(lst.contains(67));//true or false
                           /////////////

        lst.remove(0); //removes
        ////////////

        System.out.println(lst.toString());

        lst.clear();//clears
        ///////////

        System.out.println(lst.toString());






    }
}
