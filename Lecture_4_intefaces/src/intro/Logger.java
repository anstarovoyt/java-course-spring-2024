package intro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

class FileLogger implements Logger {
    private final String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(String message) {
        try {
            Files.write(Paths.get(filePath),
                    List.of(message),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class MainIntro {

    private static Logger getLogger() {
        //complex check of configuration
        return new ConsoleLogger();
    }

    public static void main(String[] args) {
        //client
        Logger logger = getLogger();
        logger.log("hello!");
        logger.log("end");
    }
}
