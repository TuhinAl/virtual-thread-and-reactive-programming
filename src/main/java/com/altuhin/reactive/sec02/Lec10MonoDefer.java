package com.altuhin.reactive.sec02;


import com.altuhin.reactive.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * This will be useful if you want to delay the Publisher creation process.
 */
public class Lec10MonoDefer {
    private static final Logger log = LoggerFactory.getLogger(Lec10MonoDefer.class);

    public static void main(String[] args) {
//        List<Integer> list = List.of(1, 2, 3, 4);
   /*     createPublisher(list)
                .subscribe(Util.subscriber());*/
        Mono.defer(Lec10MonoDefer::createPublisher).subscribe(Util.subscriber());

    }

    private static Mono<Integer> createPublisher() {
        List<Integer> list = List.of(1, 2, 3, 4);
        log.info("creating publisher.");
        Util.sleepSeconds(1); // defer
        return  Mono.fromSupplier(() -> sum(list));  //Publisher
    }

    // time-consuming business logic
    private static int sum(List<Integer> list) {
        log.info("finding the sum of {}", list);
        Util.sleepSeconds(3);
        return list.stream().mapToInt(i -> i).sum();
    }
}
