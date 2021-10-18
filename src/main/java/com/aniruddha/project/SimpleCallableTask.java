package com.aniruddha.project;

import java.util.Random;
import java.util.concurrent.Callable;

public class SimpleCallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Thread: " + Thread.currentThread().getName());
        Thread.sleep(5000);
        return new Random().nextInt();
    }
}
