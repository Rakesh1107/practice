package practice;

public class ReverseWords {
    public static void main(String[] args) {
        String word = "I am an Indian";
        System.out.println(reverseWords(word));
    }

    private static String reverseWords(String word) {
        String[] words = word.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length-1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }

        return sb.toString();
    }
}
