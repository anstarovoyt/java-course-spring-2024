package lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SafeArrayListLock {

    private final List<String> list = new ArrayList<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(String element) {
        lock.writeLock().lock();
        try {
            list.add(element);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public String get(int index) {
        lock.readLock().lock();
        try {
            // Reentrant
            // if (index >= size()) throw new IllegalArgumentException();
            return list.get(index);
        } finally {
            lock.readLock().unlock();
        }
    }

    public int size() {
        lock.readLock().lock();
        try {
            return list.size();
        } finally {
            lock.readLock().unlock();
        }
    }
}
