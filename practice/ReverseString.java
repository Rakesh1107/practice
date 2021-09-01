package practice;

public class ReverseString {

    static String recursiveReverse(String word) {
        if (word == null || word.length() <= 1) {
            return word;
        }
        return recursiveReverse(word.substring(1)) + word.charAt(0);
    }

    static String reverseString(String word) {
        char[] array = word.toCharArray();

        int n = array.length;

        for (int i = 0; i < n/2; i++) {
            swap(array, i, n-i-1);
        }

        return String.valueOf(array);
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        String word = "america";
        System.out.println(reverseString(word));
        System.out.println(recursiveReverse(word));
    }
}
