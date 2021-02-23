package arrays_methods;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {12, 35, 3, 67, 90,65};
        int [] arr2 =new int[10];

        System.out.println(Arrays.toString(arr));
        System.out.println(arr);                                                                               //will show the link of the array '[I@3feba861'

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));                                                //sorts from the smallest to the biggest

        Arrays.fill(arr2,34);                                                                                           //fill the array with val '34'

        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr,arr2));                                                                   //compares two arrays

        System.out.println(Arrays.binarySearch(arr,67));                                                          //searches for 67 in the array
        System.out.println(Arrays.binarySearch(arr,68));                                                    //if there is none returns -arr.length



        System.arraycopy(arr,2,arr2,2,4);

        System.out.println(Arrays.toString(arr2));//copies elements from arr into arr2


        int[]arr3=Arrays.copyOf(arr,5);//clones the original arr but sets length

        System.out.println(arr+" "+Arrays.toString(arr));
        System.out.println(arr3+" "+Arrays.toString(arr3));



    }
}