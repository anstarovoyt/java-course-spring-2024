package atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomicity {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.incrementAndGet();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.incrementAndGet();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Expected: 200000, Actual: " + counter);
    }

}
