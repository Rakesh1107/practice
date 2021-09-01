package pattern;

public class Slope {

    static void printPattern(String s) {

        if (s == null || s.length() == 0) {
            return;
        }

        int len = s.length();
        int mid = len/2;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i+j+1 < len) {
                    System.out.print(" ");
                }
                else {
                    int index = i+j < len+mid ?  i+j+1 - len+mid : (i+j) - (len+mid);
                    System.out.print(s.charAt(index));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String word = "PROGRAM";
        printPattern(word);
    }
}
