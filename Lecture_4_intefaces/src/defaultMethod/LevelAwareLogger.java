package defaultMethod;

public interface LevelAwareLogger
        extends Logger {
    enum LogLevel {
        ERROR, INFO
    }

    @Override
    default void log(String message) {
        log(LogLevel.INFO, message);
    }

    void log(LogLevel logLevel, String message);
}
