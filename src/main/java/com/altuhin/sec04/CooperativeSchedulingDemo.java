package com.altuhin.sec04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static com.altuhin.utills.CommonUtills.sleep;

public class CooperativeSchedulingDemo {
    private static final Logger log = LoggerFactory.getLogger(CooperativeSchedulingDemo.class);

 /*   static {
        System.setProperty("jdk.virtualThreadScheduler.parallelism","1");
        System.setProperty("jdk.virtualThreadScheduler.maxPoolSize","1");
    }*/

    public static void main(String[] args) {
        var builder = Thread.ofVirtual();
        var thread1 = builder.unstarted(() -> demo(1));
        var thread2 = builder.unstarted(() -> demo(2));
        thread1.start();
        thread2.start();
        sleep(Duration.ofSeconds(2));
    }

    private static void demo(int threadNumber) {
        log.info("thread-{} started", threadNumber);
        for (int i = 0; i < 10; i++) {
            log.info("thread-{} is printing {}. Thread: {}", threadNumber, i, Thread.currentThread());
        }
        log.info("thread-{} ended", threadNumber);
    }
}
