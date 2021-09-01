package practice;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 6, 4};
        int size = removeDuplicates(array);

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Other methods are LinkedHashSet, frequency array and HashMap

    private static int removeDuplicates(int[] array) {
        Arrays.sort(array); // O(log n)
        int j = 0;

        // O(n)
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i+1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[array.length-1];

        return j;

    }
}
