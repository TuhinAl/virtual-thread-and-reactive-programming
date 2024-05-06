package com.altuhin.thread.producerConsumer;

public class Producer implements Runnable{
    FoodQueue foodQueue;


    public Producer(FoodQueue foodQueue) {
        this.foodQueue = foodQueue;
    }

    @Override
    public void run() {

    }
}
