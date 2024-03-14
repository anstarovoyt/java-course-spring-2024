package streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByExample {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", List.of(75, 80, 85)),
                new Student("Bob", List.of(50, 40, 65)),
                new Student("Charlie", List.of(90, 95, 100))
        );

        Map<Boolean, List<Student>> partitionedStudents = students
                .stream()
                .collect(Collectors.partitioningBy(Student::hasPassed));

        System.out.println("Passed: " + partitionedStudents.get(true));
        System.out.println("Not: " + partitionedStudents.get(false));
    }

    record Student(String name, List<Integer> grades) {
        public boolean hasPassed() {
            return grades.stream().allMatch(grade -> grade >= 50);
        }
    }
}
