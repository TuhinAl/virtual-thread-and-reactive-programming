package com.altuhin.reactive.sec04;

import com.altuhin.reactive.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

public class Lec01FluxCreate {
    private static final Logger log = LoggerFactory.getLogger(Lec01FluxCreate.class);
    public static void main(String[] args) {
        Flux.create(fluxSink -> {
            String country;
            int count = 0;
            do {
                country = Util.faker().country().name();
                fluxSink.next(country);
                count++;
            } while (!country.equalsIgnoreCase("Bangladesh"));
            fluxSink.complete();
            log.info("after {} chances", count);

        }).subscribe(Util.subscriber());
    }
}
