package streams.sources;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Sources {
    public static void main(String[] args) {
        List.of("test", "test2").forEach(el -> System.out.println("test"));
        Stream<String> random = Stream.generate(() -> "r: " + Math.random());
        System.out.println(random.findFirst());

//        System.out.println(random.collect(Collectors.joining()));

//        IntStream intStream = IntStream.of(1, 2, 3);
//        System.out.println(intStream.sum());

//        String str = "hello\ntest";
//        Stream<String> lines = str.lines();
//        lines.forEach(System.out::println);
    }
}
