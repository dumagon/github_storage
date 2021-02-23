package mySheet.my_enums.pool_for_practice;

import java.util.Arrays;

public class MyInsertion {
    public static void main(String[] args) {

        int[]myArray={67,8,9,0,2};


        for (int left = 0; left <myArray.length ; left++) {
            int value =myArray[left];

            int i= left-1;

            for (; i>=0 ; i--) {

                if(value<myArray[i]){

                    myArray[i+1]=myArray[i];
                }else{
                    break;
                }

            }myArray[i+1]=value;     //// this myArray [i+1  =always 0]




        }

        System.out.println(Arrays.toString(myArray));





    }
}
