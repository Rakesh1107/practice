package practice;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "racecar";
        boolean palindrome = isPalindrome(word);
        System.out.println(palindrome);
        System.out.println(isPalindrome(word, 0, word.length()-1));
    }

    private static boolean isPalindrome(String word, int l, int r) {
        if (word == null) return false;

        if (l <= r) {
            return true;
        }

        if (word.charAt(l) != word.charAt(r)) {
            return false;
        }

        return isPalindrome(word, l+1, r-1);
    }

    private static boolean isPalindrome(String word) {

        if (word == null || word.length() == 0) return false;

        int start = 0, end = word.length()-1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }




}
