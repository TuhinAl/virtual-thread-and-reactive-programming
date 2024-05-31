package com.altuhin.reactive.sec03.assignment;

import com.altuhin.reactive.common.Util;
import com.altuhin.reactive.sec03.client.ExternalServiceClient;
import reactor.core.publisher.Mono;

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


public class StockService {

    public static void main(String[] args) {

        StockSubscriber stockSubscriber = new StockSubscriber();
        ExternalServiceClient client = new ExternalServiceClient();
        client.getPriceChanges().subscribe(stockSubscriber);

        Util.sleepSeconds(20);
    }

}
