package streams.collectors;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static streams.collectors.Student.students;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Student> map = students
                .collect(Collectors.toMap(Student::name, Function.identity()));
        System.out.println(map);
    }
}
