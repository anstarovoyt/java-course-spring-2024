package perf;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class VolatileAccess {

    private volatile int value1 = 1;
    private int value2 = 1;

    @Benchmark
    public int volatileAccess() {
        return value1;
    }

    @Benchmark
    public int nonVolatileAccess() {
        return value2;
    }
}
