package lock;

import java.util.ArrayList;
import java.util.Random;

public class SafeMainComplex {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

//        var list = new SafeArrayListSync();
        var list = new SafeArrayListLock();
        ArrayList<Thread> threads = new ArrayList<>();
        list.add("test1");
        list.add("test2");

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> processRandomRequests(list));
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Total time: " + (System.currentTimeMillis() - start));
    }

    private static void processRandomRequests(
//            SafeArrayListSync list
            SafeArrayListLock list
    ) {
        list.add("test3");
        Random random = new Random();
        for (int j = 0; j < 50000; j++) {
            String el = list.get(random.nextDouble() > 0.5 ? 1 : 0);
            if (el.equals("test3")) {
                System.out.println("test3");
            }
        }
    }
}
