package com.altuhin.sec033;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static com.altuhin.utills.CommonUtills.timer;


public class Task {

    private static final Logger log = LoggerFactory.getLogger(Task.class);

    public   static long findFibonacci(long input) {
        if (input == 0 || input == 1) {
            return input;
        }
        return findFibonacci(input - 1) + findFibonacci(input - 2);
    }


    public static void cpuIntensive(int i) {
//        log.info("Starting CPU task, Thread Info {}", Thread.currentThread());
        var timeTaken = timer(()->{
            findFibonacci(i);
        });
//        log.info("Ending CPU task, Time taken- {}", timeTaken);
    }
}
