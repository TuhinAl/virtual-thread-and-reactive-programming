package com.altuhin.utills;

import java.time.Duration;

public class CommonUtills {

    public static void sleep(Duration duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static long timer(Runnable runnable) {
        var startTime = System.currentTimeMillis();
        runnable.run();
        var endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }
}
