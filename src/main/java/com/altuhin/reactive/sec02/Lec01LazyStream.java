package com.altuhin.reactive.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

import static org.hibernate.query.sqm.tree.SqmNode.log;

/**
 * If we do not have terminal operator , then stream operator will not execute
 */

public class Lec01LazyStream {
    private static final Logger log = LoggerFactory.getLogger(Lec01LazyStream.class);
    public static void main(String[] args) {
        Stream.of(1)
                .peek(i -> log.info("received : {}", i))
                .toList();
    }
}
