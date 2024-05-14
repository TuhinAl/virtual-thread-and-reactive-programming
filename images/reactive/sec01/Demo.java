package com.altuhin.reactive.sec01;

/*
   1. publisher does not produce data unless subscriber requests for it.
   2. publisher will produce only <= subscriber requested items. publisher can also produce 0 items!
   3. subscriber can cancel the subscription. producer should stop at that moment as subscriber is no longer interested in consuming the data
   4. producer can send the error signal
 */

import com.altuhin.reactive.sec01.publisher.PublisherImpl;
import com.altuhin.reactive.sec01.publisher.SubscriptionImpl;
import com.altuhin.reactive.sec01.subscriber.SubscriberImpl;

public class Demo {
    public static void main(String[] args) {
//        demo1();
        demo2();
    }

    private static void demo1() {
        PublisherImpl publisher = new PublisherImpl();
        SubscriberImpl subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
    }

    private static void demo2() {
        PublisherImpl publisher = new PublisherImpl();
        SubscriberImpl subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
        subscriber.getSubscription().request(3);

    }
}
