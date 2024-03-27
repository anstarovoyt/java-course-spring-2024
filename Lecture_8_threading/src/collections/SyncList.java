package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static collections.CollectionMain.processList;

public class SyncList {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        processList(list);
    }
}
