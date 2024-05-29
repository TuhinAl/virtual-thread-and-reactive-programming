package com.altuhin.reactive.sec01.objpublisher;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class EmployeeSubscription implements Subscription {


    private final Subscriber<? super Employee> subscriber;

    public EmployeeSubscription(Subscriber<? super Employee> subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void request(long n) {

    }

    @Override
    public void cancel() {

    }
}
