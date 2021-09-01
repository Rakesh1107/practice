package practice;

public class CountAndSay {

    static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        if (n == 1) {
            return "1";
        }

        String res = "1";

        while (n > 1) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 0; i < res.length(); i++) {
                while (i+1 < res.length() && res.charAt(i) == res.charAt(i+1)) {
                    count++;
                    i++;
                }
                sb.append(count).append(res.charAt(i));
            }
            res = sb.toString();
            n--;
        }
        return res;
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println(countAndSay(n));
    }
}
