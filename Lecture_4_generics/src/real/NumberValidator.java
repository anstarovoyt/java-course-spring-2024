package real;

import java.util.function.Predicate;

public class NumberValidator {
    public boolean validateNumber(
            Number n,
            Predicate<? super Number> condition) {
        return condition.test(n);
    }
}
