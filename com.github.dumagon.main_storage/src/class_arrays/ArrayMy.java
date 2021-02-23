package class_arrays;

import java.util.Arrays;

public class ArrayMy {

    public static void main(String[] args) {

        int [] arr ={12,45,67,45};
        int [] arr2={56,87,90};

        Arrays.sort(arr); //-----sorting  from the smallest to te biggest

        System.out.println(Arrays.toString(arr)); // String value of array


        System.out.println(arr);//actual address in the heap


        System.out.println(Arrays.binarySearch(arr,67));// shows the index of '67'   THE ARRAY MUST BE SORTED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println(Arrays.binarySearch(arr,66)); //shows -(number) if not found

        System.out.println(Arrays.equals(arr,arr2)); //compares two arrays

        Arrays.fill(arr,44); //fills every index with '44'
        System.out.println(Arrays.toString(arr));





    }
}
