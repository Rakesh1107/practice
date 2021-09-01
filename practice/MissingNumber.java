package practice;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 6;

        System.out.println("Answer 1: " + findMissingNumber(array, n));
        System.out.println("Answer 2: " + findMissingNumber2(array, n));
        System.out.println("Answer 3: " + getMissingNo(array, n-1));
    }

    private static int findMissingNumber(int[] array, int n) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] != i+1) {
                return i+1;
            }
        }
        return i+1;
    }

    private static int findMissingNumber2(int[] array, int n) {
        int totalSum = n  * (n + 1) /2;
        int sum = 0;

        for (int j : array) {
            sum += j;
        }
        return totalSum-sum;
    }

    private static int getMissingNo(int[] array, int n) {
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++)
            total -= array[i];

        return total;
    }

}
