package perf.alg;

public class Concat {
    public static final int COUNT = 100_000;

    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < COUNT; i++) {
            result += i;
        }

        System.out.println(result.hashCode());
    }
}
