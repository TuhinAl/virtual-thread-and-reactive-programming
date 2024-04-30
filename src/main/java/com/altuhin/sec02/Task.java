package com.altuhin.sec02;

import com.altuhin.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class Task {

    public static void main(String[] args) {

    }
    private static final Logger log = LoggerFactory.getLogger(Task.class);

    public static void execute(int i) {
        log.info("Starting task {}", i);
        try {
            method1(i);
        } catch (Exception e) {
            log.error("Error for {}", i, e);
        }
        log.info("Ending task {}", i);
    }
    private static void method1(int i) {
        CommonUtil.sleep(Duration.ofMillis(500));
        try {
            method2(i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static void method2(int i) {
        CommonUtil.sleep(Duration.ofMillis(100));
        method3(i);
    }
    private static void method3(int i) {
        CommonUtil.sleep(Duration.ofMillis(500));
        if (i == 4) {
            throw new IllegalArgumentException("I cannot be 4");
        }
    }

}
