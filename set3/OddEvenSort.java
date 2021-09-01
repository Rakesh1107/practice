package set3;

import java.util.Arrays;
import java.util.Collections;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] array = {13,2,4,15,12,10,5};
        sort(array);
    }

    private static void sort(int[] array) {
        int[] result = new int[array.length];

        Integer[] oddArray = new Integer[array.length/2 + 1];
        Integer[] evenArray = new Integer[array.length/2];

        int j = 0;
        for (int i = 0; i < array.length; i+=2) {
            oddArray[j++] = array[i];
        }

        int k = 0;
        for (int i = 1; i < array.length; i+=2) {
            evenArray[k++] = array[i];
        }

        Arrays.sort(oddArray, Collections.reverseOrder());
        Arrays.sort(evenArray);

        System.out.println(Arrays.toString(oddArray));
        System.out.println(Arrays.toString(evenArray));

        j = 0;
        k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result[i] = oddArray[j];
                j++;
            } else {
                result[i] = evenArray[k];
                k++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
