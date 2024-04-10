package perf.optimizations;

import org.openjdk.jmh.annotations.Benchmark;

public class DeadCode {

    @Benchmark
    public void doNothing() {
    }

    @Benchmark
    public void objectCreation() {
        for (int i = 0; i < 100000; i++) {
            new Object();
        }
    }

    @Benchmark
    public Object objectCreationUsed() {
        return new Object();
    }
}
