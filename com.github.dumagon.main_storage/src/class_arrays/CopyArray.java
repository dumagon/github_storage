package class_arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] arr ={23,6,56,87,90,56,};
        int [] arr2 ={56,89,9,12};
        int [] arr3=Arrays.copyOf(arr,6);///creates  new array

        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.toString(arr));

        System.arraycopy(arr,0,arr2,0,4);//changes the recipient 'arr2'

        System.out.println(Arrays.toString(arr2));




    }
}
