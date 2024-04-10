package gc;

import java.util.ArrayList;

public class GcSample {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            objects.add("aaaaaaaaaaaaaaaaa".repeat(10000));
        }

        System.out.println(objects.size());
    }
}
