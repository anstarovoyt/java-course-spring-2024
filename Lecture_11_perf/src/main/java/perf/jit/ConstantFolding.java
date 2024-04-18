package perf.jit;

public class ConstantFolding {

    public static final int MULTIPLIER = 100;

    public static void main(String[] args) {
        final int x = 2;
        int y = x * MULTIPLIER;
        System.out.println(y);
    }
}
