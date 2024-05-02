package com.altuhin.sec07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.altuhin.util.CommonUtil.sleep;

public class ExecutorServiceDemo {

    private static final Logger log = LoggerFactory.getLogger(ExecutorServiceDemo.class);

    public static void main(String[] args) {

//        execute(Executors.newSingleThreadExecutor(), 3);
//        execute(Executors.newFixedThreadPool(5), 20);
        execute(Executors.newCachedThreadPool(), 200);

    }

    private static void execute(ExecutorService executorService, int taskCount ) {
        try (executorService) {
            for (int i = 0; i < taskCount; i++) {
                int j = i;
                executorService.submit(() -> ioTask(j));
            }
            log.info("submitted.");
        }
    }

    private static void ioTask(int i ) {
        log.info("Task started {}. Thread info {}", i, Thread.currentThread());
        sleep(Duration.ofSeconds(5));
        log.info("Task ended {}. Thread info {}", i, Thread.currentThread());
    }
}
