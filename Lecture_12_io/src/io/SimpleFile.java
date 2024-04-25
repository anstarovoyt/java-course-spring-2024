package io;

import java.io.FileInputStream;
import java.io.IOException;

public class SimpleFile {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("input.txt");
        int cur;
        StringBuilder builder = new StringBuilder();
        while ((cur = stream.read()) != -1) {
            builder.append((char)cur);
        }

        System.out.println(builder);
    }
}
