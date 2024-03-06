package iterable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Iterable<String> list = List.of("one", "two");

        for (String s : list) {
            System.out.println(s);
        }

        // one
        // two
    }
}
