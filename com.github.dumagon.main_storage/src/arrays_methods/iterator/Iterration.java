package arrays_methods.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterration {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(27);
        arr.add(24);


///////////////////  interface Iterator goes through an array one element by one    /////////////////////////

        Iterator<Integer> it = arr.iterator();

        while (it.hasNext()) {

            Integer integ = it.next();
            System.out.print(integ + " ");

        }

        System.out.println();

        ///////////////  ListIterator is an enriched version of Iterator (it has  '0previous()'and others )


        ListIterator<Integer> lsIt = arr.listIterator();



        while (lsIt.hasNext()) {

            Integer int1 = lsIt.next();

            System.out.print(int1 + " ");
        }


        System.out.println();


        while (lsIt.hasPrevious()) {

            System.out.print(lsIt.previous()+" ");


        }















    }
}
