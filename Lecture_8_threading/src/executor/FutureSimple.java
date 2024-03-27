package executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureSimple {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Callable<Integer> integerCallable = () -> {
            int sum = 0;
            for (int i = 0; i < 100000; i++) {
                sum += 1;
            }
            return sum;
        };

        Future<Integer> submit = executorService.submit(integerCallable);
        System.out.println("Result: " + submit.get());

        executorService.close();
    }
}
