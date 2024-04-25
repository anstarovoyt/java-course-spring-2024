package copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleFile {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("inputEx.txt");
        Path to = Paths.get("output.txt");
        if (Files.exists(to)) Files.delete(to);
        int cur;
        try (BufferedReader reader = Files.newBufferedReader(from);
             BufferedWriter writer = Files.newBufferedWriter(to)) {
            while ((cur = reader.read()) != -1) {
                writer.write(cur);
            }
        }
    }
}
