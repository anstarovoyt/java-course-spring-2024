package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ManyThreads {

    public static final int THREADS_NUMBER = 50;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            Stream<Long> generate = Stream.generate(() -> Math.round(Math.random() * 100));
            int[] array = generate.limit(10).mapToInt(Long::intValue).toArray();
            Arrays.sort(array);

            System.out.println(Arrays.toString(array));
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < THREADS_NUMBER; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
