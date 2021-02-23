package sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int []array ={6,3,0};

        for (int left =0;left<array.length;left++) {

            int value = array[left];//6  3

            int i = left - 1; //-1 0

            for(;i>=0;i--){

                if(value<array[i]){  //3<6

                    array[i+1]=array[i]; //6
                }else {
                    break;
                }
            }array[i+1]=value; //6

        }
        System.out.println(Arrays.toString(array));

    }
}
