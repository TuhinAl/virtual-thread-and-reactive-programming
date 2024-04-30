package com.altuhin.sec033;

import com.altuhin.utills.CommonUtills;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

import static com.altuhin.utills.CommonUtills.timer;

public class CPUTaskDemo {

    private static final Logger log = LoggerFactory.getLogger(Task.class);
    //    private static final int TASK_COUNT = 5;
    private static final int TASK_COUNT = 3 * Runtime.getRuntime().availableProcessors();
//    private static final int TASK_COUNT = 5;

    public static void main(String[] args) {
//        System.out.println(Task.findFibonacci(48));
        /*System.out.println(timer(()->{
            Task.findFibonacci(48);
        }));*/

//        demo(Thread.ofPlatform());
        //demo(Thread.ofVirtual().name("Virtual- ", 1));
        for (int i = 0; i < 3; i++) {
            var totalTimeCount = CommonUtills.timer(()->{
                demo(Thread.ofVirtual());
            });
            log.info("total time taken with Virtual Thread {} ms", totalTimeCount);
             totalTimeCount = CommonUtills.timer(()->{
                demo(Thread.ofPlatform());
            });
            log.info("total time taken with Platform Thread {} ms", totalTimeCount);
        }
    }

    private static void demo(Thread.Builder builder) {
        System.out.println(TASK_COUNT);
        CountDownLatch latch = new CountDownLatch(TASK_COUNT);
        for (int i = 0; i < TASK_COUNT; i++) {
            builder.start(()->{
                Task.cpuIntensive(45);
                latch.countDown();
            });
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
