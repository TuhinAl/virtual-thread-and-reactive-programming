package com.altuhin.sec07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.altuhin.util.CommonUtil.sleep;

public class AutoCloseable {

    private static final Logger log = LoggerFactory.getLogger(AutoCloseable.class);

    public static void main(String[] args) {


        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            executorService.execute(AutoCloseable::task);
            log.info("submitted");
        }
    }

    public static void task() {
        sleep(Duration.ofSeconds(1));
        log.info("Task executed.");
    }
}
