package sorting_algorithms;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {

        int [] array=new int [5];
        array[0]=3;
        array[1]=6;
        array[2]=7;
        array[3]=0;
        array[4]=5;

        System.out.println(Arrays.toString(array));





       array=countSort(array,7);
        System.out.println(Arrays.toString(array));





    }

    ///////// counting sort is not comparison based !!!!! ////////

    //////////// we have to know the maximal value of the objects in the array  !!!!!  ////////

    public static int[] countSort(int[] toSort,int maxValue){

        int[] numCounts=new int[maxValue+1];  //indexes of this array represent the values of the sorted array
        for (int num:toSort) {

            numCounts[num]++;    // we increase values of the indexes that meet the values in the toSort array, by one ++

        }

        int[] sortedArray=new int[toSort.length];

        int currentSortedIndex=0;

        for (int n = 0; n <numCounts.length ; n++) {

            int count=numCounts[n];

            for (int k = 0; k <count ; k++) {

                sortedArray[currentSortedIndex]=n; // we write indexes of the numCount that we previously increased
                currentSortedIndex++;    // now they represent values in the sortedArray  after sorting

            }

        }

        return sortedArray;


    }





}
