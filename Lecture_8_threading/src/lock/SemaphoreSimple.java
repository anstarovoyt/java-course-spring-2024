package lock;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class SemaphoreSimple {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.incrementAndGet();
            }
            semaphore.release();
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.incrementAndGet();
            }
            semaphore.release();
        });

        thread1.start();
        thread2.start();

        semaphore.acquire(2);

        System.out.println("Expected: 200000, Actual: " + counter);
    }

}
