package handlers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodHandlersMain {

    public static void main(String[] args) throws Throwable {
        String name = args[0];
        Class<?> className = Class.forName(name);

        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle constructorHandle = lookup.findConstructor(className,
                MethodType.methodType(void.class));

        Object instance = constructorHandle.invoke();
        int success = 0;
        int errors = 0;
        MethodType methodType = MethodType.methodType(void.class);

        for (Method method : className.getMethods()) {
            String methodName = method.getName();
            if (!Modifier.isStatic(method.getModifiers()) && methodName.startsWith("test")) {
                try {
                    MethodHandle methodHandle = lookup.findVirtual(className, methodName, methodType);
                    methodHandle.invoke(instance);
                    success++;
                } catch (Throwable e) {
                    errors++;
                }
            }
        }

        System.out.println("Success: " + success + ", Errors: " + errors);
    }
}

