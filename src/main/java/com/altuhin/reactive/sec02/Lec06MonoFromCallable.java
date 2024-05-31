package com.altuhin.reactive.sec02;


import com.altuhin.reactive.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.List;

/**
    To delay the execution using supplier / callable
    Used to provide a value lazily when subscribed to, with the ability to handle checked exceptions.

 Uses: Use when you have a function that returns a value and might throw a checked exception.
 Example: Accessing a database, reading a file, or any I/O operation.
 */

public class Lec06MonoFromCallable {
    private static final Logger log = LoggerFactory.getLogger(Lec06MonoFromCallable.class);

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
