package set3;

public class XOPattern {
    public static void main(String[] args) {
        int m = 6, n = 7;

        printPattern(m, n);
    }

    private static void printPattern(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m-1 || j == n-1) {
                    System.out.print("X");
                }
                else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
