package com.altuhin.sec05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.altuhin.utills.CommonUtills.sleep;

public class Lec02SynchronizationWithIO {
    private static final Logger log = LoggerFactory.getLogger(Lec02SynchronizationWithIO.class);
    private static final List<Integer> list = new ArrayList<>();



    public static void main(String[] args) {
        Runnable runnable = () -> log.info("*** Test Message ***");
        demo(Thread.ofVirtual());
        Thread.ofVirtual().start(runnable);
        sleep(Duration.ofSeconds(15));
        //demo(Thread.ofPlatform());
    }

    private static void demo(Thread.Builder builder) {
        for (int i = 0; i < 50; i++) {
            builder.start(() ->{
                log.info("Task started, {}", Thread.currentThread());
                    IOTask();
                log.info("Task ended, {}", Thread.currentThread());
            });
        }
    }

    private static synchronized void IOTask() {
        list.add(1);
        sleep(Duration.ofSeconds(10));
    }
}
