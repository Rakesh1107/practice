package practice;

public class Armstrong {
    public static void main(String[] args) {
        int n = 1634;
        System.out.println(isArmstrong(n));
    }

    private static boolean isArmstrong(int n) {
        int power = String.valueOf(n).length();
        int temp = n;

        int result = 0, rem;
        while (n != 0) {
            rem = n % 10;
            result += (int) Math.pow(rem, power);
            System.out.println((int) Math.pow(rem, power));
            n/=10;
        }

        return result == temp;
    }
}
