package perf.optimizations;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

/**
 * Benchmark                 Mode  Cnt  Score   Error  Units
 * Inlining.baseline         avgt       0.546          ns/op
 * Inlining.inlineCandidate  avgt       0.546          ns/op
 */
@State(Scope.Thread)
public class Inlining {

    private int a = 10;
    private int b = 20;

    private int simpleAdd(int x, int y) {
        return x + y;
    }

    @Benchmark
    public int baseline() {
        return a + b;
    }

    @Benchmark
    public int inlineCandidate() {
        return simpleAdd(a, b);
    }
}
