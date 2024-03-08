package list;

import java.util.*;

public class SingletonList<T> extends AbstractList<T> {

    private final T el;

    public SingletonList(T el) {
        this.el = el;
    }

    @Override
    public T get(int index) {
        if (index != 0) throw new IndexOutOfBoundsException();
        return el;
    }

    @Override
    public int size() {
        return 1;
    }
}
