package iterable;

import java.util.Iterator;

public class IterableSingleton<T> implements Iterable<T> {

    private final T el;

    public IterableSingleton(T el) {
        this.el = el;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            T current = el;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                var result = current;
                current = null;
                return result;
            }
        };
    }
}

class MainIterable {
    public static void main(String[] args) {
        Iterable<String> iterable = new IterableSingleton<>("hello");
        for (String s : iterable) {
            System.out.println(s);
        }
    }
}
