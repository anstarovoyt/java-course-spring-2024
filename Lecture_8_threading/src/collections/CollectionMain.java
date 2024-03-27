package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        processList(list);
    }

    static void processList(List<String> list) throws InterruptedException {
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
