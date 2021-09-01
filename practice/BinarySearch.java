package practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 9, 6, 3, 10};
        System.out.println(binarySearch(array, 6));
    }

    private static int binarySearch(int[] array, int a) {
        return binarySearch(array, 0, array.length-1, a);
    }

    private static int binarySearch(int[] arr, int l, int r, int a) {
        Arrays.sort(arr);

        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == a)
                return mid;

            if (arr[mid] > a)
                return binarySearch(arr, l, mid - 1, a);

            return binarySearch(arr, mid + 1, r, a);
        }

        return -1;
    }
}
