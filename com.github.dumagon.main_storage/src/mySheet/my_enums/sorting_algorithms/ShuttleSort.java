package mySheet.my_enums.sorting_algorithms;

import java.util.Arrays;

public class ShuttleSort {
    public static void main(String[] args) {
         int[]array={3,0,67,9,90};

        System.out.println(Arrays.toString(array));

        for (int i = 1; i <array.length ; i++) {

            if(array[i]<array[i-1]){

                swap(array,i,i-1);
                for (int z = i-1; z-1>=0 ; z--) {

                    if(array[z]<array[z-1]){

                        swap(array,z,z-1);
                    }else {

                        break;
                    }

                }

            }

        }
        System.out.println(Arrays.toString(array));




    }

     public static void swap(int[] array, int Ind1, int Ind2 ){

    int temp = array[Ind1];
    array[Ind1] = array[Ind2];
    array[Ind2] = temp;
}
}
