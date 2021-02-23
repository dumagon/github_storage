package sorting_algorithms;

import java.util.Arrays;

public class Bubbles {

    public static void main(String[] args) {


        int[] array = {23, 45, 6, 8, 12, 56};


        System.out.println(Arrays.toString(array));

        boolean need_it_again = true;

        while (need_it_again) {

            need_it_again=false;

            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    System.out.println("1");
                    need_it_again=true;
                }
            }




        }
        System.out.println(Arrays.toString(array));


    }

    public static void swap(int[] array, int a1, int a2) {

        int temp = array[a1];
        array[a1] = array[a2];
        array[a2] = temp;
    }
}



