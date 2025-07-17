import java.util.*;
    public class dedede  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        double result = calculatePower(x, n);

        System.out.println(x + "^" + n + " = " + result);

        scanner.close();
    }

    public static double calculatePower(double x, int n) {
        if (n == 0) {
                return 1; // Any number raised to the power of 0 is 1
               }         else if (n > 0) {
               double result = 1;
               for (int i = 0; i < n; i++) {
                result *= x;
                return result;
            }
            return result;
        } else {
            // If n is negative, calculate the reciprocal of x raised to the positive n
             n = -n;
             double result = 1;
              for (int i = 0; i < n; i++) {
                result *= x;
                 return result;
            }
                return 1 / result;
        }
    }
}
