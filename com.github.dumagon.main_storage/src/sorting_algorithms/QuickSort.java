package sorting_algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = {4, 56, 7, 2, 1, 0};

        int leftBoarder = 0;
        int rightBoarder = array.length-1;

        quickSort(array,leftBoarder,rightBoarder);
        System.out.println(Arrays.toString(array));


    }


    static void quickSort(int[] toSort, int leftBoarder, int rightBoarder) {

        int leftMarker = leftBoarder;
        int rightMarker = rightBoarder;
        int pivot = toSort[(leftBoarder + rightBoarder) / 2];

        do {

            while (toSort[leftMarker] < pivot) {
                leftMarker++;
            }

            while(toSort[rightMarker]>pivot){

                rightMarker--;
            }

            if(leftMarker<=rightMarker){

                if(leftMarker<rightMarker){

                    int temp=toSort[leftMarker];
                    toSort[leftMarker]=toSort[rightMarker];
                    toSort[rightMarker]=temp;

                }
                leftMarker++;
                rightMarker--;

            }

        }while(leftMarker<=rightMarker);

        if (leftMarker<rightBoarder){
            quickSort(toSort,leftMarker,rightBoarder);
        }
        if(leftBoarder<rightMarker){
            quickSort(toSort,leftBoarder,rightMarker);
        }





    }
}