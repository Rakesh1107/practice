package practice;

public class StringPermutations {

    public static void main(String[] args) {
        String word = "abc";
        permute(word);
        Thread.dumpStack();
    }

    // TC - O(n*n!)
    private static void permute(String word) {
        char[] array = word.toCharArray();
        permute(array, 0, word.length()-1);
    }

    private static void permute(char[] array, int l, int r) {

        if (l == r) {
            System.out.println(String.valueOf(array));
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(array, l, i);
            permute(array, l+1, r);
            swap(array, l, i);
        }

    }

    private static void swap(char[] array, int l, int i) {
        char temp = array[l];
        array[l] = array[i];
        array[i] = temp;

    }

}
