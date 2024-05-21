package com.altuhin.reactive.sec02;


import com.altuhin.reactive.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

/**
 * Creating a publisher is a lightweight operation
 * Executing time-consuming business logic should be delayed
 */
public class Lec09PublisherCreativeVsExecution {
    private static final Logger log = LoggerFactory.getLogger(Lec09PublisherCreativeVsExecution.class);

    public static void main(String[] args) {


    }

    private static Mono<String> getName() {
        log.info("entered the method");
        return Mono.fromSupplier(() -> {
            log.info("generating name");
            return "tuhin";
        });
    }
}
