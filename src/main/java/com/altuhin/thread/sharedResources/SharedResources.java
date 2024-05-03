package com.altuhin.thread.sharedResources;

public class SharedResources {

    boolean itemAvailable = false;

    public synchronized void produceItem(){
        System.out.println("Item added by "+Thread.currentThread().getName()+" and invoking all thread which are waiting.");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumed method invoked by: "+Thread.currentThread().getName());

        //using while loop to avoid "spurious wake-up", sometimes because of system noise.
        while (!itemAvailable) {
            try {
                System.out.println("Thread: "+Thread.currentThread().getName() +" is waiting now.");
                wait(); // it release the monitor lock.
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Item Consumed by: "+Thread.currentThread().getName());
        itemAvailable = false;
    }
}
