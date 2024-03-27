package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static collections.CollectionMain.processList;

public class CopyList {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new CopyOnWriteArrayList<>();
        processList(list);
    }
}
