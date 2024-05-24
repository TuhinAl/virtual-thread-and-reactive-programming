package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import reactor.core.publisher.Flux;

public class Lec06Log {
    public static void main(String[] args) {
        // Flux.range(10, 5).subscribe(Util.subscriber());

        // assignment
        Flux.range(1, 10)
                .log("range-map")
                .map( i -> Util.faker().name().firstName())
                .log("map-subscribe")
                .subscribe(Util.subscriber());
    }
}
