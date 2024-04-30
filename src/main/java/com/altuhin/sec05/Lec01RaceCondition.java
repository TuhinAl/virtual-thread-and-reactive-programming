package com.altuhin.sec05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.altuhin.utills.CommonUtills.sleep;

public class Lec01RaceCondition {
    private static final Logger log = LoggerFactory.getLogger(Lec01RaceCondition.class);
    private static final List<Integer> list = new ArrayList<>();



    public static void main(String[] args) {
        demo(Thread.ofPlatform());
        sleep(Duration.ofSeconds(2));
        log.info("List size: {}", list.size());
    }

    private static void demo(Thread.Builder builder) {
        for (int i = 0; i < 50; i++) {
            builder.start(() ->{
                log.info("Task started, {}", Thread.currentThread());
                for (int j = 0; j < 200; j++) {
                    inMemoryTask();
                }
                log.info("Task ended, {}", Thread.currentThread());
            });
        }
    }

    private static void inMemoryTask() {
        list.add(1);
    }
}
