package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VariousLists {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("array");
        System.out.println(array);

        List<String> unmodifiable = Collections.unmodifiableList(array);
        System.out.println("unmodifiable: " + unmodifiable);

        List<String> singleton = Collections.singletonList("singleton");
        System.out.println(singleton);

        List<String> immutable = List.of("immutable");
        System.out.println(immutable);

        List<String> empty = Collections.emptyList();
        System.out.println(empty);
    }
}
