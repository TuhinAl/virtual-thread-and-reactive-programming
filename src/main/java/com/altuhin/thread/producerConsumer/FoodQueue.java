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

    private synchronized void foodOrder() {
        //if()

    }

    private synchronized void foodDelivery() {

    }

}
