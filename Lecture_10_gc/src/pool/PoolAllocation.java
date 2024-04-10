package pool;

import java.util.ArrayList;

public class PoolAllocation {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
//            objects.add(("aaaaaaaaaaaa" + i).repeat(10000));
            objects.add((("aaaaaaaaaa" + i).repeat(10000)).intern());
        }

        System.out.println(objects.size());
    }
}
