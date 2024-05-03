package com.altuhin.thread;

public class MultiThreadLearningMain {
    public static void main(String[] args) {
        System.out.println("Inside main method: "+Thread.currentThread().getName());
        MultiThreadLearning learning = new MultiThreadLearning();
        Thread thread = new Thread(learning);
        thread.start();
        System.out.println("main method finished: "+Thread.currentThread().getName());
    }
}
