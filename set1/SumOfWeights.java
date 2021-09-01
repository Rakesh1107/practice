package set1;

import java.util.Map;
import java.util.TreeMap;

public class SumOfWeights {

    public static void main(String[] args) {
        int[] array = {10, 36, 54, 89, 12};
        findSumOfWeight(array);
    }

    private static void findSumOfWeight(int[] array) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int j : array) {
            int weight = 0;
            double squareRoot = Math.sqrt(j);
            if (squareRoot * squareRoot == j) weight += 5;
            if (j % 4 == 0 && j % 6 == 0) weight+=4;
            if (j % 2 == 0) weight+=3;

            map.put(weight, j);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.print("<" + entry.getValue() + "," + entry.getKey() + ">,");
        }
    }
}
