package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new ConcurrentHashMap<>();
//        Map<String, Integer> map = new HashMap<>();

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            for (int i = 0; i < 1000; i++) {
                map.compute(threadName, (key, val) -> (val == null) ? 0 : val + 1);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
