package com.altuhin.reactive.sec03.helper;

import com.altuhin.reactive.common.Util;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.IntStream;

public class NameGenerator {

    public static List<String> generateNameList(int count) {
        return IntStream.rangeClosed(1, count)
                .mapToObj(i -> generateName())
                .toList();
    }
    public static Flux<String> generateNameFlux(int count) {
        return Flux.range(1, count)
                .map(i -> generateName());
    }
    private static String generateName() {
        Util.sleepSeconds(1);
        return Util.faker().name().firstName();
    }
}
