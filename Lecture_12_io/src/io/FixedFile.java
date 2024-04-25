package io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FixedFile {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if (!file.exists() || file.isDirectory()) return;
        int cur;
        ByteArrayOutputStream builder = new ByteArrayOutputStream();
        try (FileInputStream stream = new FileInputStream(file)) {
            while ((cur = stream.read()) != -1) {
                builder.write(cur);
            }
        } catch (IOException e) {
            System.out.println("Error");
            return;
        }

        System.out.println(builder);
    }
}
