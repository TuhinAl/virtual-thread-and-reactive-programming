package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import reactor.core.publisher.Flux;

import java.util.List;

public class Lec05FluxRange {
    public static void main(String[] args) {
        // Flux.range(10, 5).subscribe(Util.subscriber());

        // assignment
        Flux.range(1, 10)
                .map( i -> Util.faker().name().firstName())
                .subscribe(Util.subscriber());
    }
}
