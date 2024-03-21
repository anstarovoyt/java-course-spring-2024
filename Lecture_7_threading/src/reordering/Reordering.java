package reordering;

public class Reordering {
    private static int A = 0;
    private static int B = 0;

    private static int r1 = 0;
    private static int r2 = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            r1 = A;
            B = 2;
        });

        Thread thread2 = new Thread(() -> {
            r2 = B;
            A = 1;
        });

        new Thread(() -> {
            try {
                Thread.sleep(1);
                System.out.println("[r1: " + r1 + "; r2: " + r2 + "]");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        thread2.start();
        thread1.start();
    }
}
