package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import reactor.core.publisher.Flux;

public class Lec02MultipleSubscriber {
    public static void main(String[] args) {
        Flux.just(1, 2, 3, 4, 5, 6, 7).subscribe(Util.subscriber("Subscriber-1"));
        Flux.just(1, 2, 3, 4, 5, 6, 7)
                .filter( i -> i > 7)
                .subscribe(Util.subscriber("Subscriber-2"));

        Flux.just(1, 2, 3, 4, 5, 6, 7)
                .filter(i -> i % 2 == 0)
                .map(i -> i+" Test")
                .subscribe(Util.subscriber("Subscriber-3"));
    }
}
