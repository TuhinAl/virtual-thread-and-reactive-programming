package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import com.altuhin.reactive.sec03.client.ExternalServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.time.Duration;

/*
    To emit a message based on the given interval
 */
public class Lec09FluxInterval {
    private static final Logger log = LoggerFactory.getLogger(Lec09FluxInterval.class);

    public static void main(String[] args) {
        Flux.interval(Duration.ofMillis(5000))
                .map(i -> Util.faker().name().firstName())
                .subscribe(Util.subscriber());

        Util.sleepSeconds(40);

    }
}
