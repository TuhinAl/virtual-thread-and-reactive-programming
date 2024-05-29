package com.altuhin.reactive.sec02;


import com.altuhin.reactive.sec01.publisher.SubscriptionImpl;
import com.altuhin.reactive.sec01.subscriber.SubscriberImpl;
import reactor.core.publisher.Mono;

/**
 *   N:B Mono is Use just when the value to be emitted is already in the memory
 *
 */

public class Lec02MonoJust {
    public static void main(String[] args) {
        // we will create Publisher
        Mono<String> mono = Mono.just("Tuhin");
        System.out.println(mono); // this line will not print the value, because u know it is Lazy
        //soln: we will have to subscribe, only then it will emit the value
        // before that I have to create a subscriber
        SubscriberImpl subscriber = new SubscriberImpl();
        mono.subscribe(subscriber);
        subscriber.getSubscription().request(10);

    }
}
