package streams.collectors;

import java.util.List;
import java.util.stream.Stream;

record Student(String name, List<Integer> grades) {
    public static Stream<Student> students = Stream.of(
            new Student("Alice", List.of(75, 80, 85)),
            new Student("Bob", List.of(50, 40, 65)),
            new Student("Charlie", List.of(90, 95, 100)),
            new Student("Diana", List.of(10, 10, 10))
    );

    public int maxGrade() {
        return grades.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    public int minGrade() {
        return grades.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public boolean hasPassed() {
        return grades.stream().allMatch(grade -> grade >= 50);
    }
}
