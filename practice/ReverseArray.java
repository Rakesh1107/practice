package practice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 7, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            swap(array, i, n-1-i);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
