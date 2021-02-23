package mySheet.my_enums.pool_for_practice;

import java.util.Arrays;

public class MyBubbles {

    public static void main(String[] args) {

        int[] myArr={4,3,78,0};

        boolean notSortedYet =true;

        while(notSortedYet){

            notSortedYet = false;


            for (int i = 1; i <myArr.length ; i++) {




                if (myArr[i] < myArr[i - 1]) {

                    swap(myArr, i, i - 1);

                    notSortedYet = true;


                }

            }

        }
        System.out.println(Arrays.toString(myArr));



    }

    public static void swap (int[]myarray,int Ind1,int Ind2){

        int temp= myarray[Ind1];
        myarray[Ind1]=myarray[Ind2];
        myarray[Ind2]=temp;

    }
}
