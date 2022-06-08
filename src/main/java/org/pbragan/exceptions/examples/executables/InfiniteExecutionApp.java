package org.pbragan.exceptions.examples.executables;

import org.pbragan.exceptions.examples.services.InfiniteExecutionService;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class InfiniteExecutionApp {

    public static void main(String[] args){
        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.submit(new InfiniteExecutionService(Duration.ofMinutes(5L)));
            executorService.awaitTermination(10L, TimeUnit.SECONDS);
            executorService.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            System.out.println("FINALLY PASSED!!");
        }
    }
}
