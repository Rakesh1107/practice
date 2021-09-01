package practice;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String one = "tea";
        String two = "eat";

        System.out.println(isAnagram(one, two));
    }

    private static boolean isAnagram(String one, String two) {
        char[] array1 = one.toCharArray();
        char[] array2 = two.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return String.valueOf(array1).equals(String.valueOf(array2));
    }
}
