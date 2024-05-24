package com.altuhin.reactive.sec04;

import com.altuhin.reactive.common.Util;
import com.altuhin.reactive.sec04.helper.NameGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.util.ArrayList;

public class Lec03FluxSinkThreadSafety {
private static final Logger log = LoggerFactory.getLogger(Lec03FluxSinkThreadSafety.class);
    public static void main(String[] args) {
        demo2();
    }
    private static void demo1() {
        ArrayList<Integer> list = new ArrayList<>();

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread.ofPlatform().start(runnable);
        }
        Util.sleepSeconds(3);
        log.info("list size: {}", list.size());

    }

    private static void demo2() {
        ArrayList<String> list = new ArrayList<>();
        NameGenerator nameGenerator = new NameGenerator();
        Flux<String> flux = Flux.create(nameGenerator);
        flux.subscribe(list::add);

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                nameGenerator.generate();
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread.ofPlatform().start(runnable);
        }
        Util.sleepSeconds(3);
        log.info("list size: {}", list.size());

    }
}
