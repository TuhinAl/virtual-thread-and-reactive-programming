package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import reactor.core.publisher.Flux;

public class Lec01FluxJust {
    public static void main(String[] args) {
        Flux.just(1, 2, "Tuhin").subscribe(Util.subscriber());
    }
}
