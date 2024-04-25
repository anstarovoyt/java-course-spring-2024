package nio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("inputEx.txt");
        int cur;
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = Files.newBufferedReader(path);
        while ((cur = reader.read()) != -1) {
            builder.append((char)cur);
        }

        System.out.println(builder);
    }
}
