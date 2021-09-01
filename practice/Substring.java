package practice;

public class Substring {

    static int isSubstring(String one, String two) {

        int m = one.length();
        int n = two.length();

        for (int i = 0; i < n - m + 1; i++) {
            int j = 0;
            for (; j < m; j++) {
                if (one.charAt(j) != two.charAt(i + j)) {
                    break;
                }
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    static int subString(String one, String two) {

        int i = 0;
        int count = 0;

        for (; i < two.length(); i++) {
            if (count == one.length()) {
                break;
            }
            if (one.charAt(count) == two.charAt(i)) {
                count++;
            } else {

                if (count > 0) {
                    i -= count;
                    System.out.println(i);
                }
                count = 0;
            }
        }
        return count == one.length() ? i - count : -1;
    }

    public static void main(String[] args) {
        String one = "cat";
        String two = "conccccat";
//        System.out.println(isSubstring(one, two));
        System.out.println(subString(one, two));
    }
}
