package optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Optionals {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("test2", "test", "test", "xtest");
        Optional<String> firstResult = stream
                .filter(el -> el.startsWith("z"))
                .findFirst();

        System.out.println(firstResult.orElse("nothing"));
    }
}
