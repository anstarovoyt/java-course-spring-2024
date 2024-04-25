package io;

import java.io.*;

public class ReaderFile {
    public static void main(String[] args) {
        File file = new File("inputEx.txt");
        if (!file.exists() || file.isDirectory()) return;
        int cur;
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            while ((cur = reader.read()) != -1) {
                builder.append((char)cur);
            }
        } catch (IOException e) {
            System.out.println("Error");
            return;
        }

        System.out.println(builder);
    }
}
