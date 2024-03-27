package executor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CompletableFutureSimple {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Supplier<Integer> integerCallable = () -> {
            int sum = 0;
            for (int i = 0; i < 100000; i++) {
                sum += 1;
            }
            return sum;
        };

        CompletableFuture
                .supplyAsync(integerCallable, executorService)
                .thenAccept(System.out::println);

        executorService.close();
    }
}
