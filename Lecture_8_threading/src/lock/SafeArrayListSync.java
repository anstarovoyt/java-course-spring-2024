package lock;

import java.util.ArrayList;
import java.util.List;

public class SafeArrayListSync {
    private final List<String> list = new ArrayList<>();

    public synchronized void add(String element) {
        list.add(element);
    }

    public synchronized String get(int index) {
        return list.get(index);
    }

    public synchronized int size() {
        return list.size();
    }
}
