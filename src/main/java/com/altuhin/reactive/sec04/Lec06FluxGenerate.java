package com.altuhin.reactive.sec04;

/*
    Flux generate
    - invokes the given lambda expression again and again based on downstream demand.
    - We can emit only one value at a time
    - will stop when complete method is invoked
    - will stop when error method is invoked
    - will stop downstream cancels
 */

import com.altuhin.reactive.common.Util;
import reactor.core.publisher.Flux;

public class Lec06FluxGenerate {

    public static void main(String[] args) {

        Flux.generate(synchronousSink -> {
            synchronousSink.next(1);
        }).take(4)
                .subscribe(Util.subscriber());

    }
}
