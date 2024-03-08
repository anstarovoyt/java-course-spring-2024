package set;

import java.util.AbstractSet;
import java.util.Iterator;

public class SingletonSet<T> extends AbstractSet<T> {


    @Override
    public Iterator<T> iterator() {
        return null; //todo(!)
    }

    @Override
    public int size() {
        return 0;
    }
}
