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
        LevelAwareLogger levelLogger = new ConsoleLogger();
//        levelLogger.log("test1");
        levelLogger.log(LogLevel.INFO, "test2");

        Logger logger = new ConsoleLogger();
        logger.log("test1");
//        logger.log(LogLevel.ERROR, "test2");

        ConsoleLogger logger3 = new ConsoleLogger();
        logger3.log("test1");
        logger3.log(LogLevel.ERROR, "test2");

//        LevelAwareLogger & Logger logger4 = new ConsoleLogger();
//        logger4.log("test1");
//        logger4.log(LogLevel.ERROR, "test2");
    }
}
