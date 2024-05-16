package com.altuhin.reactive.sec02;


import com.altuhin.reactive.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;


public class Lec04MonoEmptyError {
    private static final Logger log = LoggerFactory.getLogger(Lec04MonoEmptyError.class);

    public static void main(String[] args) {
//        getUsername(34).subscribe(Util.subscriber());
        getUsername(34).subscribe(
                s -> System.out.println(s),
                err -> {}
        ); //onNext()
    }

    private static Mono<String> getUsername(int userID) {
        return switch (userID) {
            case 1 -> Mono.just("AlTuhin");
            case 2 -> Mono.empty();//null
            default -> Mono.error(new RuntimeException("Invalid UserID"));
        };
    }
}
