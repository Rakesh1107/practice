package practice;

public class WordsInBetween {
    public static void main(String[] args) {
        String sentence = "There is a is a storm in the desert";
        String word1 = "is";
        String word2 = "the";

        countWordsInBetween(sentence, word1, word2);
    }

    private static void countWordsInBetween(String sentence, String word1, String word2) {
        int count = 0;

        boolean started = false;

        for (String temp : sentence.split(" ")){
            if (temp.equals(word1)) {
                started = true;
                count=0;
            }
            else if (temp.equals(word2)) {
                break;
            }
            else if (started) {
                count++;
            }


        }
        System.out.println(count);
    }
}
