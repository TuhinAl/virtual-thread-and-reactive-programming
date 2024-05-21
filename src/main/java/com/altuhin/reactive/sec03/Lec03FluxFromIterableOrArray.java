package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import reactor.core.publisher.Flux;

import java.io.Serializable;
import java.util.List;

public class Lec03FluxFromIterableOrArray {
    public static void main(String[] args) {
        List<String> list = List.of("Dhaka", "Khulna", "Rajshahi", "Bagura");

        // Flux from iterable
        Flux.fromIterable(list).subscribe(Util.subscriber("sub-1"));

        // Flux from Array
        Integer[] numberList = {1, 2, 3, 4, 5, 6, 7, 8};
        Flux.fromArray(numberList).subscribe(Util.subscriber("Array-Thread: "));
    }
}
