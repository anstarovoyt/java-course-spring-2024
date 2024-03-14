package streams.collectors;

import java.util.Comparator;
import java.util.stream.Collectors;

import static streams.collectors.Student.students;

public class TeeingExample {
    public static void main(String[] args) {
        String highestAndLowestAverage = students
                .collect(Collectors.teeing(
                        Collectors.maxBy(Comparator.comparingInt(Student::maxGrade)),
                        Collectors.minBy(Comparator.comparingInt(Student::minGrade)),
                        (highest, lowest) -> highest.get() + ", " + lowest.get()
                ));

        System.out.println(highestAndLowestAverage);
    }
}
