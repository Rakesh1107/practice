package practice;

import java.util.Arrays;

public class SortByFactors {

    static int[] findFactors(int[] array) {

        int[] factors = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int factor = 0;
            int sqrt = (int) Math.sqrt(array[i]);
            if (sqrt * sqrt == array[i]) factor++;

            for (int j = 1; j < sqrt; j++) {
                if (array[i] % j == 0) {
                    factor+=2;
                }
            }
            factors[i] = factor;
        }

        sortByFactors(array, factors);
        System.out.println(Arrays.toString(factors));
        return array;
    }

    private static void sortByFactors(int[] array, int[] factors) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < factors.length-1; j++) {
                if (factors[j] < factors[j+1]) {
                    swap(array, j, j+1);
                    swap(factors, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {104, 210, 315, 166, 441, 180};
        int[] result = findFactors(array);
        System.out.println(Arrays.toString(result));
    }
}
