package set2;

import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] result = alternateSort(array);
        int[] result2 = alternateSort2(array);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

    // Optimal solution O(n) & O(1)
    private static int[] alternateSort2(int[] array) {

        int start = 0, end = array.length-1;
        int maxi = array[end]+1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[i] + array[end] % maxi * maxi;
                end--;
            } else {
                array[i] = array[i] + array[start] % maxi * maxi;
                start++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i]/=maxi;
        }
        return array;
    }

    // Brute Force solution O(n) & O(n)
    private static int[] alternateSort(int[] array) {
        int[] temp = new int[array.length];

        int start = 0, end = array.length-1;

        int i = 0;
        while (start < end) {
            temp[i++] = array[end];
            end--;
            temp[i++] = array[start];
            start++;
        }
        if (array.length % 2 == 1)
            temp[i] = array[start];

        return temp;
    }

}
