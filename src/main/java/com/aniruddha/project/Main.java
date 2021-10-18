package com.aniruddha.project;

public class Main {

    public static void main(String[] args) {
        final int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("No of cores: " + coreCount);

        HelloExecutorService helloExecutorService = new HelloExecutorService(coreCount);

        try {
            helloExecutorService.startPlayground();
            helloExecutorService.stopPlayground();
        } catch (Exception e){
            System.out.println("Some exception occurred.");
        }
    }
}
