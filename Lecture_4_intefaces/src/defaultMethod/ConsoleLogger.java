package defaultMethod;


public class ConsoleLogger implements LevelAwareLogger {
    @Override
    public void log(LogLevel logLevel, String message) {
        System.err.println(logLevel + " " + message);
    }
}

