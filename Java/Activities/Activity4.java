package activities;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args){
        int[] unsortedArray = {3,4,1,2,5,6};
        insertionSort(unsortedArray);
        System.out.println("Sorted Array in Ascending Order: "+Arrays.toString(unsortedArray));
    }
    static void insertionSort(int[] array){
        int size = array.length, i;

        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
}

