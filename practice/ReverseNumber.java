package practice;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 192;
        reverseNumber(n);
    }

    private static void reverseNumber(int n) {
        int reverse = 0, rem = 0;

        while (n != 0) {
            rem = n % 10;
            reverse = (reverse*10) + rem;
            n/=10;
        }

        System.out.println(reverse);
    }
}
