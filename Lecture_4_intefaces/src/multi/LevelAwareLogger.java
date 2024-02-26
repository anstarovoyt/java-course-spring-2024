package multi;

public interface LevelAwareLogger {
    enum LogLevel {
        ERROR,
        INFO
    }

    void log(LogLevel logLevel, String message);
}
