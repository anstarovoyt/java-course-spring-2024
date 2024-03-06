package map;

import java.util.HashMap;

public class Fibo {

    private final HashMap<Integer, Long> cache
            = new HashMap<>();

    public long fib(int n) {
        if (n <= 1) return n;
        Long candidate = cache.get(n);

        if (candidate != null) return candidate;
        long fibValue = fib(n - 1) + fib(n - 2);

        cache.put(n, fibValue);
        return fibValue;
    }

    public static void main(String[] args) {
        Fibo calculator = new Fibo();
        System.out.println(calculator.fib(1000));
    }
}
