package practice;

public class NumberRange {

    public static void main(String[] args) {
        int range = 100;
        int[] array = {5, 0, 6};
        findNumbersInRange(range, array);
    }

    private static void findNumbersInRange(int range, int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                String temp1 = String.valueOf(array[i]);
                String temp2 = String.valueOf(array[j]);
                int val = Integer.parseInt(temp1+temp2);
                if (val < range) System.out.print(val + ", ");
            }
        }
    }
}
