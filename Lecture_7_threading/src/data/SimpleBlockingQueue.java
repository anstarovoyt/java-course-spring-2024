package data;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleBlockingQueue {
    private final Deque<Integer> queue = new ArrayDeque<>();

    public synchronized void put(int value) throws InterruptedException {
        queue.add(value);
        notify();
    }

    public synchronized int get() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        notify();
        return value;
    }

    public static void main(String[] args) {
        SimpleBlockingQueue queue = new SimpleBlockingQueue();

        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                int value = (int) Math.round(Math.random() * 10);
                try {
                    queue.put(value);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Produced " + value);

            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    System.out.println("Consumed " + queue.get());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();
    }
}

