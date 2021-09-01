package practice;

import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        int capacity = 10;
        int[] weights = {1, 3, 4, 6};
        int[] values = {20, 10, 30, 50};
        
        knapsack(capacity, weights, values);
    }

    private static void knapsack(int capacity, int[] weights, int[] values) {

        int items = weights.length; // number of items
        int[][] matrix = new int[items+1][capacity+1];

        for (int i = 0; i < capacity+1; i++) {
            matrix[0][i] = 0;
        }

        for (int i = 0; i < items+1; i++) {
            matrix[i][0] = 0;
        }

        for (int i = 1; i <= items; i++) {
            for (int j = 1; j <= capacity; j++) {

                int maxValueWithoutCurrent = matrix[i-1][j];
                int maxValueWithCurrent = 0;

                int currentWeight = weights[i-1];

                if (currentWeight <= capacity) {
                    maxValueWithCurrent = values[i-1];

                    int remainingCapacity = capacity - currentWeight;

                    maxValueWithCurrent += matrix[i-1][remainingCapacity];
                }
                matrix[i][j] = Math.max(maxValueWithCurrent, maxValueWithoutCurrent);
            }
        }

        System.out.println(matrix[items][capacity]);
        System.out.println(Arrays.deepToString(matrix));
    }
}
