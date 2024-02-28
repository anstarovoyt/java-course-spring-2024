package statics;

public interface Logger {
    void log(String message);

    static Logger getLogger() {
        //complex check of configuration
        return new ConsoleLogger();
    }
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

class MainStatics {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log("hello");
    }
}
