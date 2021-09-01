package practice;

public class SquareRoot {

    public static void main(String[] args) {
        int n = 49;
        int sqrt = findSquareRoot(n);
        int sqrt2 = findSquareRoot2(n);
        System.out.println(sqrt);
        System.out.println(sqrt2);
    }

    // O(log n)
    private static int findSquareRoot2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int start = 0, end = n, ans = 0;
        while (start <= end) {
            int mid = (start+end)/2;
            if (mid*mid == n) {
                return mid;
            }
            if (mid*mid < n) {
                start = mid + 1;
                ans = mid;
            }
            else {
                end = mid - 1;
            }

        }
        return ans;
    }

    // Floor Square root - O(n)
    private static int findSquareRoot(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int i = 1, result = 1;
        while (result <= n) {
            i++;
            result = i*i;
        }
        return i-1;
    }

}
