package com.aniruddha.project;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class HelloExecutorService {

    private static int CORE_COUNT;
    private ExecutorService executorService;

    public HelloExecutorService(final int coreCount){
        CORE_COUNT = coreCount;
        executorService = Executors.newFixedThreadPool(CORE_COUNT);
    }

    public void startPlayground() {
        for(int i = 0; i < 5; ++i){
            SimpleCallableTask simpleCallableTask = new SimpleCallableTask();
            Future<Integer> future = executorService.submit(simpleCallableTask);
            boolean isDone = future.isDone();
            System.out.println("Result = " + isDone);
        }
    }

    public void stopPlayground() throws InterruptedException {
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
    }
}
