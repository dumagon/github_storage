package sorting_algorithms;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {

        int[]array={34,7,5,23,0};
        int gap =array.length/2;
        while(gap>=1){

            for (int right = 0; right <array.length ; right++) {

                for (int c =right-gap; c >=0 ; c-=gap) {



                    if (array[c]>array[c+gap]){

                        swap(array,c,c+gap);


                    }

                }

            }
            gap=gap/2;
        }
        System.out.println(Arrays.toString(array));



    }

    public static void swap(int[] array, int Ind1, int Ind2 ){

        int temp = array[Ind1];
        array[Ind1] = array[Ind2];
        array[Ind2] = temp;
    }
}
