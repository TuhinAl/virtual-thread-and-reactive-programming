package com.altuhin.thread.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class FoodQueue {
    private Queue<Food> foodQueue;
    private int bufferSize;

    public FoodQueue(int bufferSize) {
        this.foodQueue = new LinkedList<Food>();
        this.bufferSize = bufferSize;
    }

    private synchronized void producer(int item) throws InterruptedException {
        System.out.println("producing....");
        while (foodQueue.size() == item) {
            System.out.println("Buffer is full, Producer is waiting for consume....");
            wait();
        }
        foodQueue.add(new Food("Fried Rice and Chicken fry."));
            // check if Q is full or not, if full then please wait
notifyAll();
    }

    private synchronized void consumer() throws InterruptedException {
        System.out.println("Consuming....");
        while (foodQueue.isEmpty()) {
            System.out.println("Buffer is Empty, Consumer is waiting for Producer....");
            wait();
        }
    }

}
