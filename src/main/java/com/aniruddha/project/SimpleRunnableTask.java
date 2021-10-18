package com.aniruddha.project;

public class SimpleRunnableTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is printing Hello");
    }
}
