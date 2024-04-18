package perf.alg;

import java.util.HashMap;
import java.util.Map;

public class Fibo {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        System.out.println("Result calculation: " + (fibonacci(50)));
        System.out.println("Time: " + (System.currentTimeMillis() - before) + "ms");
    }

    public static long fibonacci(long n) {
        if (n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacciAlt(long n) {
        if (n <= 1) return n;

        long a = 0;
        long b = 1;
        for (long i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    private static final Map<Long, Long> cache = new HashMap<>();

    public static long fibonacciMemo(long n) {
        if (n <= 1) return n;

        Long result = cache.get(n);
        if (result == null) {
            result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
            cache.put(n, result);
        }

        return result;
    }
}
