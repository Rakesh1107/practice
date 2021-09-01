package practice;

public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int _gcd = gcd(12, 30);
        System.out.println(_gcd);
    }
}
