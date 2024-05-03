package com.altuhin.thread;

public class MultiThreadLearning implements Runnable{
    @Override
    public void run() {
        System.out.println("Code Executed by Thread: "+Thread.currentThread().getName());
    }
}
