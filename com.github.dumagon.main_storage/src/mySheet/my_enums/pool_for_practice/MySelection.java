package mySheet.my_enums.pool_for_practice;

import java.util.Arrays;

public class MySelection {
    public static void main(String[] args) {

        int[]myArray={4,67,2,8,0};

        for (int left = 0; left <myArray.length ; left++) {

            int min=left;

            for (int i = left; i <myArray.length ; i++) {



                if (myArray[i]<myArray[min]){

                    min=i;
                }

            }swap(myArray,left,min);



        }
        System.out.println(Arrays.toString(myArray));

    }
    public static void swap(int[] myArray,int left,int min){

        int temp =myArray[left];
        myArray[left]=myArray[min];
        myArray[min]=temp;

    }

}
