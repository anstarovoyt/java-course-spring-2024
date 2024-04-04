package annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestRunner {
    public static void main(String[] args) throws Exception {
        String name = args[0];
        Class<?> className = Class.forName(name);
        Constructor<?> constructor = className.getDeclaredConstructors()[0];
        Object instance = constructor.newInstance();

        int success = 0;
        int errors = 0;
        for (Method method : className.getMethods()) {
            if (!Modifier.isStatic(method.getModifiers()) &&
                    method.isAnnotationPresent(Test.class)) {
                try {
                    method.invoke(instance);
                    success++;
                } catch (Exception e) {
                    errors++;
                }
            }
        }

        System.out.println("Success: " + success + ", errors: " + errors);
    }
}
