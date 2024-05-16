package com.altuhin.reactive.sec02;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;


public class Lec03MonoSubscribe {
    private static final Logger log = LoggerFactory.getLogger(Lec03MonoSubscribe.class);

    public static void main(String[] args) {
        // we will create Publisher using mono
        Mono<String> mono = Mono.just("Tuhin");
        mono.subscribe(i -> log.info("received: {}", i));
    /**
     * at this point you might have two questions:
     * (Question:-1) where is the Completed? last time it was printed.
     *  ""MonoJust
     * 10:20:38.556 [main] INFO com.altuhin.reactive.sec01.subscriber.SubscriberImpl -- received: Tuhin
     * 10:20:38.566 [main] INFO com.altuhin.reactive.sec01.subscriber.SubscriberImpl -- completed""
     * (Question-2:) we only subscribe, did not request, so how did this publisher emitted that value?
     */

    //Soln:
        mono.subscribe(
                i -> log.info("received: {}", i),
                error -> log.error("error: ", error),
                () -> log.info("completed")
        );

    }
}
