package sorting;

import java.util.Arrays;

public class SelectionSort {

    private static void selectionSort(int[] array) {
        if (array == null || array.length == 0) return;

        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private static void swap(int[] array, int i, int minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 1, 2, 9, 5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
