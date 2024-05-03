package com.altuhin.thread.sharedResources;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread started.");
        SharedResources sharedResources = new SharedResources();

        Thread producerThread = new Thread(new ProduceTask(sharedResources));
        Thread consumerThread = new Thread(new ConsumeTask(sharedResources));

        producerThread.start();
        consumerThread.start();

        System.out.println("Main Thread ended.");
    }
}
