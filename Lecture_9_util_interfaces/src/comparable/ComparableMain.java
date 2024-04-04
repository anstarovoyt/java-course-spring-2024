package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {
    public static void main(String[] args) {
        ArrayList<Configuration> objects = new ArrayList<>();
        objects.add(new Configuration("localhost2", 3000));
        objects.add(new Configuration("localhost1", 3000));
        objects.add(new Configuration("localhost3", 3000));

        Collections.sort(objects);

        System.out.println(objects);
    }
}
