package com.altuhin.sec01;

import java.util.concurrent.CountDownLatch;

public class InboundOutboundTaskDemo {

    private static final int MAX_PLATFORM = 10;
    private static final int MAX_VIRTUAL = 10;

    public static void main(String[] args) throws InterruptedException {
        virtualThreadDemo();
    }

    private static void platformThreadDemo1() {
        for (int i = 0; i < MAX_PLATFORM; i++) {
            int j = i;
            Thread thread = new Thread(() -> Task.ioIntensive(j));
            thread.start();
        }
    }

    private static void platformThreadDemo2() {
        Thread.Builder builder = Thread.ofPlatform().name("Thread");
        for (int i = 0; i < MAX_PLATFORM; i++) {
            int j = i;
            Thread thread = builder.unstarted(() -> Task.ioIntensive(j));
            thread.start();
        }
    }

    private static void platformThreadDemo3() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(MAX_PLATFORM);
        Thread.Builder builder = Thread.ofPlatform().daemon().name("Daemon", 1);
        for (int i = 0; i < MAX_PLATFORM; i++) {
            int j = i;
            Thread thread = builder.unstarted(() -> {
                Task.ioIntensive(j);
                latch.countDown();
            });
            thread.start();
        }
        latch.await();

    }


    private static void virtualThreadDemo() throws InterruptedException {
        Thread.Builder builder = Thread.ofVirtual().name("Virtual-", 1);
        CountDownLatch latch = new CountDownLatch(MAX_VIRTUAL);
        for (int i = 0; i < MAX_VIRTUAL; i++) {
            int j = i;
            Thread thread = builder.unstarted(() -> {
                Task.ioIntensive(j);
                latch.countDown();
            });
            thread.start();
        }
        latch.await();

    }
}
