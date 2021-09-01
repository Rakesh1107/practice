package sorting;

import java.util.Arrays;

public class InsertionSort {

    private static void insertionSort(int[] array) {

        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 1, 2, 9, 5};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
