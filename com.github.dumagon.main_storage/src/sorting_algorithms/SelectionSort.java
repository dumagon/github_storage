package sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[]array ={12,56,7,88,0,3,67};

        System.out.println(Arrays.toString(array));



             for(int left =0;left<array.length;left++){

                 int minId =left;  //to start to count from the next index in the array

                 for(int i =left;i<array.length;i++){

                     if(array[i]<array[minId]){

                         minId=i; // the smallest index
                     }
                 }
                 swap(array,left,minId);
             }
        System.out.println(Arrays.toString(array));

    }
    public static void swap(int[] array, int left, int minId) {

        int temp = array[left];
        array[left] = array[minId];
        array[minId] = temp;
    }
}
