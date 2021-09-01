package practice;

public class ValidShuffle {
    public static void main(String[] args) {

        String one = "abc";
        String two = "def";
        String three = "dacbef";

        boolean valid = checkIfValid(one, two, three);
        System.out.println(valid);
    }

    private static boolean checkIfValid(String one, String two, String three) {
        int pointer1 = 0, pointer2 = 0;

        for (int i = 0; i < three.length(); i++) {
            if (pointer1 < one.length() && three.charAt(i) == one.charAt(pointer1)) {
                pointer1++;
            }
            else if (pointer2 < two.length() && three.charAt(i) == two.charAt(pointer2)) {
                pointer2++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
