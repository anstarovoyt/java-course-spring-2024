package copy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DirectBufferFile {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("input.txt");
        Path to = Paths.get("output.txt");
        if (Files.exists(to)) {
            Files.delete(to);
        }
        Files.createFile(to);
        try (SeekableByteChannel in = Files.newByteChannel(from);
             SeekableByteChannel out = Files.newByteChannel(to, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocateDirect(2048);
            while (in.read(buffer) != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    out.write(buffer);
                }
                buffer.clear();
            }
        }
    }
}
