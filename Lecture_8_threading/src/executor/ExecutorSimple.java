package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorSimple {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ": "
                        + counter.incrementAndGet());
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementAndGet();
            }
        });

        executorService.submit(runnable);
        executorService.close();
        System.out.println("Result: " + counter);
    }
}
