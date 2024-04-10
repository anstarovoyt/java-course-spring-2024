package gc;

public class Memory {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        final long bytesPerMB = 1024L * 1024L;
        System.out.println(runtime.maxMemory() / bytesPerMB);
    }
}
