package visibility;

public class SharingThreads {

    private static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (!flag) {
            }
            System.out.println("Thread 1 seen the flag");
        }).start();

        Thread.sleep(100);

        new Thread(() -> {
            flag = true;
            System.out.println("Thread 2 set the flag");
        }).start();
    }
}
