package terminal;

import java.util.List;

public class FilteringStream {
    public static void main(String[] args) {
        List<String> elements = List.of("test2", "test", "test", "xtest");
        elements
                .stream()
                .filter(el -> el.startsWith("t"))
                .map(el -> capitalize(el))
                .sorted()
                .peek(el -> System.out.println(el));
//                .toList();
    }

    private static String capitalize(String el) {
        return el.isEmpty() ? el : el.substring(0, 1).toUpperCase() + el.substring(1);
    }
}
