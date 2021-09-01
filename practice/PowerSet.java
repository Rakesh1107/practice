package practice;

public class PowerSet {

    // TC - O(2^n)
    static void powerSet(String word, int index, String current) {

        if (index == word.length()) {
            System.out.println(current);
            return;
        }

        powerSet(word, index+1, current + word.charAt(index));
        powerSet(word, index+1, current);
    }

    public static void main(String[] args) {
        String word = "abc";
        powerSet(word, 0, "");
    }
}
