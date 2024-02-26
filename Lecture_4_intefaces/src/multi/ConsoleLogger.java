package multi;

import multi.LevelAwareLogger.LogLevel;

public class ConsoleLogger
        implements Logger, LevelAwareLogger {
    @Override
    public void log(String message) {
        log(LogLevel.INFO, message);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        System.err.println(logLevel + " " + message);
    }
}

class MainMulti {
    public static void main(String[] args) {
        LevelAwareLogger consoleLogger = new ConsoleLogger();
        consoleLogger.log(LogLevel.INFO, "test1");
        consoleLogger.log(LogLevel.ERROR, "test2");
    }
}
