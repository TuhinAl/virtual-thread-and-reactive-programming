package com.altuhin.thread.sharedResources;

public class ProduceTask implements Runnable{

    SharedResources sharedResources;


    public ProduceTask(SharedResources sharedResources) {
        this.sharedResources = sharedResources;
    }

    @Override
    public void run() {
            System.out.println("Producer Thread: "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedResources.produceItem();
    }
}
