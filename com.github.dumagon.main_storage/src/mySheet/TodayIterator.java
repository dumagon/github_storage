package mySheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class JustA_lass {

    int a;
    public void returnVar(){

        System.out.println(a);


    };

    JustA_lass factory (int b){



        return new JustA_lass(){

            int a=b;

            public void returnVar (){

                System.out.println(a);
            }


        };
    }

}

public class TodayIterator {
    public static void main(String[] args) {


       JustA_lass justA_lass=new JustA_lass();


       List<JustA_lass>justA_List =new ArrayList<>();
        justA_List.add(justA_lass.factory(3));
        justA_List.add(justA_lass.factory(31));
        justA_List.add(justA_lass.factory(377));




        System.out.println(justA_List);


        Iterator iterator =justA_List.iterator();

        while (iterator.hasNext()){

       JustA_lass a = (JustA_lass) iterator.next();
       a.returnVar();





        }




        }











    }

