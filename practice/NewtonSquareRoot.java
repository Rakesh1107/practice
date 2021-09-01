package practice;

public class NewtonSquareRoot {
    public static void main(String[] args) {
        double n = 327;
        double l = 0.00001;

        System.out.println(squareRoot(n, l));
    }

    static double squareRoot(double n, double l) {
        // Assuming the sqrt of n as n only
        double x = n;

        // The closed guess will be stored in the root
        double root;

        while (true) {
            // Calculate more closed x
            root = 0.5 * (x + (n / x));

            // Check for closeness
            if (Math.abs(root - x) < l)
                break;

            // Update root
            x = root;
        }

        return root;
    }
}
