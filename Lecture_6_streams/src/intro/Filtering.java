package intro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Filtering {
    public static void main(String[] args) {
        System.out.println(new Filtering().search(List.of("test2", "test", "test", "xtest"), "t"));
    }

    Collection<String> search(
            Collection<String> elements, String prefix) {
        List<String> result = new ArrayList<>();
        for (String el : elements) {
            if (el.startsWith(prefix)) result.add(el);
        }
        Collections.sort(result);

        return result;
    }
}
