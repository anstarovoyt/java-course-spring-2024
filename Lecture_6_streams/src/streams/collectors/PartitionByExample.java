package streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static streams.collectors.Student.students;

public class PartitionByExample {

    public static void main(String[] args) {
        Map<Boolean, List<Student>> partitionedStudents = students
                .collect(Collectors.partitioningBy(Student::hasPassed));

        System.out.println("Passed: " + partitionedStudents.get(true));
        System.out.println("Not: " + partitionedStudents.get(false));
    }

}
