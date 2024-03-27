package deadlock;

public class Deadlock {
    private static int counter = 0;
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                synchronized (lock1) {
                    synchronized (lock2) {
                        counter++;
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                synchronized (lock1) {
                    synchronized (lock2) {
                        counter++;
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Expected: 200000, Actual: " + counter);
    }

}
