package intro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FilteringStream {
    public static void main(String[] args) {
        System.out.println(new FilteringStream().search(List.of("test2", "test", "test", "xtest"), "t"));
    }

    Collection<String> search(
            Collection<String> elements, String prefix) {
        return elements
                .stream()
                .filter(el -> el.startsWith(prefix))
                .map(el -> capitalize(el))
                .sorted()
                .peek(el -> System.out.println(el))
                .toList();
    }

    private String capitalize(String el) {
        return el.isEmpty() ? el : el.substring(0, 1).toUpperCase() + el.substring(1);
    }
}
