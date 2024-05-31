package com.altuhin.reactive.sec02;


import com.altuhin.reactive.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * To delay the execution using supplier / callable
 * The Supplier simply provides a value without throwing checked exceptions.
 * The Supplier interface has a single method get() which does not throw checked exceptions.
 * Suitable for operations that do not involve any exceptions or blocking calls.
 */

public class Lec05MonoFromSupplier {
    private static final Logger log = LoggerFactory.getLogger(Lec05MonoFromSupplier.class);

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        Mono.fromSupplier(() -> sum(list))  //Publisher
                .subscribe(Util.subscriber());

    }

    private static int sum(List<Integer> list) {
        log.info("finding the sum of {}", list);
        return list.stream().mapToInt(i -> i).sum();
    }
}
