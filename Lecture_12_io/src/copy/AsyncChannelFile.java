package copy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AsyncChannelFile {
    public static void main(String[] args) throws Exception {
        Path from = Paths.get("input.txt");
        Path to = Paths.get("output.txt");
        if (Files.exists(to)) Files.delete(to);

        Files.createFile(to);
        AsynchronousFileChannel in = AsynchronousFileChannel.open(from);
        AsynchronousFileChannel out = AsynchronousFileChannel.open(to, StandardOpenOption.WRITE);
        ByteBuffer buffer = ByteBuffer.allocate(2);
        readAndWrite(in, out, buffer, 0);
        Thread.sleep(1000);
    }

    private static void readAndWrite(AsynchronousFileChannel in,
                                     AsynchronousFileChannel out,
                                     ByteBuffer buffer,
                                     int position) {
        in.read(buffer, position, null, new CompletionHandler<Integer, Void>() {
            @Override
            public void completed(Integer bytesRead, Void attachment) {
                if (bytesRead == -1) {
                    try {
                        in.close();
                        out.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    return;
                }
                buffer.flip();
                out.write(buffer, position, null, new CompletionHandler<Integer, Void>() {
                    @Override
                    public void completed(Integer result, Void attachment) {
                        buffer.clear();
                        readAndWrite(in, out, buffer, position + result);
                    }

                    @Override
                    public void failed(Throwable exc, Void attachment) {
                    }
                });
            }

            @Override
            public void failed(Throwable exc, Void attachment) {
            }
        });
    }
}
