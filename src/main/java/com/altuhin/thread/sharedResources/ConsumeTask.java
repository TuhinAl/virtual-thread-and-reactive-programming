package com.altuhin.thread.sharedResources;

public class ConsumeTask implements Runnable{

    SharedResources sharedResources;


    public ConsumeTask(SharedResources sharedResources) {
        this.sharedResources = sharedResources;
    }

    @Override
    public void run() {
        System.out.println("Consumer Thread: " + Thread.currentThread().getName());
        sharedResources.consumeItem();
    }
}
