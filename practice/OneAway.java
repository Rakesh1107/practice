package practice;

public class OneAway {

    static boolean isOneAway(String word1, String word2) {
        if (Math.abs(word1.length() - word2.length()) > 1) {
            return false;
        }

        // If strings are of same length, check if they are one replace away
        if (word1.length() == word2.length()) {
            return isOneReplace(word1, word2);
        }

        // If strings differ by length of 1, check if they are one edit(add/remove) away
        return isOneEdit(word1, word2);

    }

    static private boolean isOneEdit(String word1, String word2) {
        String s1 = word1.length() > word2.length() ? word1 : word2;
        String s2 = word1.length() > word2.length() ? word2 : word1;
        int i1 = 0, i2 = 0;

        while (i1 < s1.length() && i2 < s2.length()) {
            if (s1.charAt(i1) != s2.charAt(i2)) {
                if (i1 != i2) {
                    return false;
                }
                i2++;
            }
            else {
                i1++;
                i2++;
            }
        }

        return true;
    }

    static private boolean isOneReplace(String word1, String word2) {
        int n = word1.length();
        boolean foundDiff = false;

        for (int i = 0; i < n; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                if (foundDiff) {
                    return false;
                }
                foundDiff = true;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isOneAway("apll", "apple"));
    }
}
