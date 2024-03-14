package functions;

import java.util.List;
import java.util.function.Consumer;

public class Functions {
    public static void main(String[] args) {
        List<String> elements = List.of("test2", "test", "test", "xtest");
        elements.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Simple: " + s);
            }
        });

        elements.forEach(el -> System.out.println("Functional: " + el));

        elements.forEach(System.out::println);
    }
}
