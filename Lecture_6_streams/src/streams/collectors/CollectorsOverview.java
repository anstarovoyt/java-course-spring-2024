package streams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsOverview {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("test2", "test", "test", "xtest");
        System.out.println(stream.collect(Collectors.joining(", ")));
    }
}
