package com.altuhin.reactive.sec01.publisher;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PublisherImpl implements Publisher<String> {

    private static final Logger log = LoggerFactory.getLogger(PublisherImpl.class);

    @Override
    public void subscribe(Subscriber<? super String> subscriber) {
        //hey subscription you take the subscriber
        var subscription = new SubscriptionImpl(subscriber);
        //hey subscriber, you take the subscription
        subscriber.onSubscribe(subscription);
    }

}
