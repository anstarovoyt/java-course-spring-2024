package perf.jit;

public class DeadCode {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        add(5, 3);
        System.out.println(8);
    }
}
