package com.altuhin.reactive.sec02;


import com.altuhin.reactive.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * emitting empty after some method invocation
 * The Runnable interface has a single method run() which does not return a result or throw checked exceptions.
 * Suitable for side-effecting operations that don’t return a value but may affect external state.
 *
 * Uses: Use when you want to run some logic that has side effects without expecting a result, and you want to know when it completes.
 * Example: Logging, updating a status, sending a notification, or any other side-effecting operation.
 */
public class Lec07MonoFromRunnable {
    private static final Logger log = LoggerFactory.getLogger(Lec07MonoFromRunnable.class);

   /* public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        Mono.fromSupplier(() -> sum(list))  //Publisher
                .subscribe(Util.subscriber());

    }*/

    public static void main(String[] args) {

        getProductName(2)
                .subscribe(Util.subscriber());

    }

    private static Mono<String> getProductName(int productId){
        if(productId == 1){
            return Mono.fromSupplier(() -> Util.faker().commerce().productName());
        }
        return Mono.fromRunnable(() -> notifyBusiness(productId));
    }

    private static void notifyBusiness(int productId){
        log.info("notifying business on unavailable product {}", productId);
    }
}
