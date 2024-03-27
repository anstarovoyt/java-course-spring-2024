package atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicityStep {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                while (true) {
                    if (update()) break;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                while (true) {
                    if (update()) break;
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Expected: 400000, Actual: " + counter);
    }

    private static boolean update() {
        int old = counter.get();
        return counter.compareAndSet(old, old + 2);
    }
}
