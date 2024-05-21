package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Lec04FluxFromStream {
    public static void main(String[] args) {
        List<String> divisionList = List.of("Dhaka", "Khulna", "Rajshahi", "Bagura");

        // Flux from iterable
        // Flux.fromIterable(list).subscribe(Util.subscriber("sub-1"));

        // Flux from Array
         Integer[] numberList = {1, 2, 3, 4, 5, 6, 7, 8};
         List<Integer>  numList= List.of(1, 2, 3, 4, 5, 6, 7, 8);

       var divisionStream = divisionList.stream();

        Flux<String> stringFlux = Flux.fromStream(divisionList::stream);
        stringFlux.subscribe(Util.subscriber("Array-Thread-1: "));
        stringFlux.subscribe(Util.subscriber("Array-Thread-2: "));
     /*   var ll = numList.stream();
        ll.forEach(System.out::println);
        ll.forEach(System.out::println);*/
    }
}
