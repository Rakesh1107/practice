package practice;

import java.util.Arrays;

import static practice.GCD.gcd;

public class JugglingAlgo {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 1, 6};
        int d = 3;
        rotateArray(array, d);
        System.out.println(Arrays.toString(array));
    }

    private static void rotateArray(int[] array, int d) {
        int n = array.length;

        d = d%n;
        int _gcd = gcd(d, n);

        int i, j, k, temp;
        for (i = 0; i < _gcd; i++) {
            temp = array[i];
            j = i;
            while (true) {
                k = j + d;

                if (k >= n) {
                    k-=n;
                }
                if (k == i) {
                    break;
                }
                array[j] = array[k];
                j = k;
            }
            array[j] = temp;
        }

    }


}
