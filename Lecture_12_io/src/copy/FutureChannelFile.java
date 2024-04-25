package copy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FutureChannelFile {
    public static void main(String[] args) throws Exception {
        Path from = Paths.get("input.txt");
        Path to = Paths.get("output.txt");
        if (Files.exists(to)) Files.delete(to);

        Files.createFile(to);
        AsynchronousFileChannel in = AsynchronousFileChannel.open(from);
        AsynchronousFileChannel out = AsynchronousFileChannel.open(to, StandardOpenOption.WRITE);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        readAndWrite(in, out, buffer, 0);
    }

    private static void readAndWrite(AsynchronousFileChannel in,
                                     AsynchronousFileChannel out,
                                     ByteBuffer buffer,
                                     int position) throws Exception {
        Future<Integer> future = in.read(buffer, position);

        if (future.get() != -1) {
            buffer.flip();
            Future<Integer> outFuture = out.write(buffer, position);
            Integer written = outFuture.get();
            buffer.clear();
            readAndWrite(in, out, buffer, position + written);
        } else {
            in.close();
            out.close();
        }
    }
}
