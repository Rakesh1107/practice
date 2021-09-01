package sorting;

import java.util.Arrays;

public class BubbleSort {

    private static void bubbleSort(int[] array) {
        int n = array.length;

        boolean sorted;
        for (int i = 0; i < n; i++) {
            sorted = true;
            for (int j = 0; j < n-1-i; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 1, 2, 9, 5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
