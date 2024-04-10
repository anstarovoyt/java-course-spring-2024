package perf.alg;

public class Fibo {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        System.out.println("Result calculation: " + (fibonacci(35)));
        System.out.println("Time: " + (System.currentTimeMillis() - before) + "ms");
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciAlt(int n) {
        if (n <= 1) return n;

        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
