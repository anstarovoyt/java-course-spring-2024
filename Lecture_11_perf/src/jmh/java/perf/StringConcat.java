package perf;

import org.openjdk.jmh.annotations.Benchmark;

public class StringConcat {

    public static final int COUNT = 100_000;

    @Benchmark
    public String benchmarkSlow() {
        String result = "";
        for (int i = 0; i < COUNT; i++) {
            result += i;
        }
        return result;
    }

    @Benchmark
    public String benchmarkFast() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            result.append(i);
        }
        return result.toString();
    }
}

