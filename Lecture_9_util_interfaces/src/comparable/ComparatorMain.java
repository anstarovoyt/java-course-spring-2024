package comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Configuration> objects = new ArrayList<>();
        objects.add(new Configuration("localhost2", 3000));
        objects.add(new Configuration("localhost1", 3000));
        objects.add(new Configuration("localhost3", 3000));
        objects.add(new Configuration("localhost1", 1000));

        objects.sort(Comparator
                .<Configuration, String>comparing(el -> el.host)
                .thenComparing(el -> el.port));

        System.out.println(objects
                .stream()
                .map(Configuration::toString)
                .collect(Collectors.joining("\n"))
        );
    }
}
