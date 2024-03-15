package functions;

public class CustomFunctions {
    public static void main(String[] args) {
        String hello = "hello";
        process(hello, System.out::println);
        processString(hello, System.out::println);
    }

    private static <T> void process(T el, Processor<T> processor) {
        processor.process(el);
    }

    private static void processString(String el, StringProcessor processor) {
        processor.process(el);
    }

    @FunctionalInterface
    interface Processor<T> {
        void process(T el);

        default String name() {
            return "processor";
        }

        /**
         * Own description of the behavior e.g. should be synced with {@link #name()}
         */
        @Override
        String toString();
    }

    @FunctionalInterface
    interface StringProcessor extends Processor<String> {
        @Override
        default void process(String el) {
            processString(el);
        }

        void processString(String el);
    }
}
