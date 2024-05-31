package com.altuhin.reactive.sec03.assignment;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;


/**
 *
 The stock service will emit price changes every 500ms for ~20 seconds. The price might change between 80-120.
 • Task
 • Create a subscriber with $1000 balance.
 。 Whenever the price drops below 90, you buy a stock.
 。 When the price goes above 110
 you sell all the quantities.
 cancel the subscription.
 print the profit you made!
 */
public class StockSubscriber implements Subscriber<Integer> {

    private static final Logger log = LoggerFactory.getLogger(StockSubscriber.class);
    private  Subscription subscription;
    private int quantity = 0;
    private int balance = 1000;

    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
        this.subscription = subscription;
    }

    @Override
    public void onNext(Integer price) {
        if (price < 90 && balance >= price) {
            quantity++;
            balance -= price;
            log.info("bought a stock at {}. total quantity: {}, remaining balance: {}", price, quantity, balance);
        } else if (price > 110 && quantity > 0) {
            log.info("selling {} quantities at {}", quantity, price);
            balance = balance + (quantity * price);
            quantity = 0;
            subscription.cancel();
            log.info("profit: {}", (balance - 1000));
        }
    }

    @Override
    public void onError(Throwable throwable) {
        log.error("error", throwable);
    }

    @Override
    public void onComplete() {
        log.info("onComplete()");
    }
}
