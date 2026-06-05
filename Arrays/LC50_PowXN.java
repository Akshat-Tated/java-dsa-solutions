package Arrays;

public class LC50_PowXN {
    public static double power(double x, long n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;
        
        // If n is even
        if (n % 2 == 0) {
            return power(x * x, n / 2);
        }
        
        // If n is odd
        // return x * power(x, n - 1);
        return x * power(x * x, n / 2); // more efficient
    }
    
    public static double myPow(double x, int n) {
        long N = n;
        if (n < 0) {
            return 1.0 / power(x, -N);
        }
        return power(x, N);
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(power(x, n));
    }
    
}
