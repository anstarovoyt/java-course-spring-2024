package lock;

public class SafeMainSimple {
    public static void main(String[] args) throws InterruptedException {
        SafeArrayListLock list = new SafeArrayListLock();
//        SafeArrayListSync list = new SafeArrayListSync();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                list.add(String.valueOf(i));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                list.add(String.valueOf(i));
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("List size: " + list.size());
    }
}
