package practice;

public class Factorial {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(findFactorial(n));
        System.out.println(findFactorial2(n));
    }

    private static long findFactorial2(int n) {
        long start = System.currentTimeMillis();
        long result = 1;
        while(n != 0) {
            result*=n;
            n--;
        }
        System.out.println(System.currentTimeMillis()-start);
        return result;
    }

    private static long findFactorial(int n) {
        long start = System.currentTimeMillis();
        if (n == 0) {
            System.out.println(System.currentTimeMillis()-start);
            return 1;
        }
        return n * findFactorial(n-1);
    }
}
