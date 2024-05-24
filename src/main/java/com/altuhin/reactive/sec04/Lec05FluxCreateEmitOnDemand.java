package com.altuhin.reactive.sec04;

import com.altuhin.reactive.common.Util;
import com.altuhin.reactive.sec01.subscriber.SubscriberImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

/**
 * Flux create does NOT check the downstream demand by default! It is by design.
 */

public class Lec05FluxCreateEmitOnDemand {
    private static final Logger log = LoggerFactory.getLogger(Lec05FluxCreateEmitOnDemand.class);

    public static void main(String[] args) {
        produceOnDemand();
    }

    private static void produceEarly() {
        SubscriberImpl subscriber = new SubscriberImpl();

        Flux.<String>create( fluxSink -> {
            for (int i = 0; i < 10; i++) {
                String name = Util.faker().name().firstName();
                log.info("generated: {}", name);
                fluxSink.next(name);
            }
            fluxSink.complete();
        }).subscribe(subscriber);


        Util.sleepSeconds(2);
        log.info("after two seconds:");
        subscriber.getSubscription().request(2);

        Util.sleepSeconds(2);
        log.info("after two seconds:");
        subscriber.getSubscription().request(2);

        Util.sleepSeconds(2);
        log.info("after two seconds:");
        subscriber.getSubscription().request(2);
        log.info("Completed!!!!!");
    }

    private static void produceOnDemand() {
        SubscriberImpl subscriber = new SubscriberImpl();

        Flux.<String>create( fluxSink -> {
            fluxSink.onRequest(request -> {
                for (int i = 0; i < request && !fluxSink.isCancelled(); i++) {
                    String name = Util.faker().name().firstName();
                    log.info("generated: {}", name);
                    fluxSink.next(name);
                }
            });
        }).subscribe(subscriber);


        Util.sleepSeconds(2);
        log.info("after two seconds:");
        subscriber.getSubscription().request(2);

        Util.sleepSeconds(2);
        log.info("after two seconds:");
        subscriber.getSubscription().request(2);

        Util.sleepSeconds(2);
        log.info("after two seconds:");
        subscriber.getSubscription().request(2);
        log.info("Completed!!!!!");
    }
}
