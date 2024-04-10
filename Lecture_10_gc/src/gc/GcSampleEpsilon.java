package gc;

import java.util.ArrayList;

public class GcSampleEpsilon {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
//            "aaaaaaaaaaaaaaaaa".repeat(1000);
            objects.add("aaaaaaaaaaaaaaaaa".repeat(1000));
        }

        System.out.println(objects.size());
    }
}
