package com.altuhin.reactive.sec03.client;

import com.altuhin.reactive.common.AbstractHttpClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ExternalServiceClient extends AbstractHttpClient {


    public Mono<String> getName() {
      return   this.httpClient.get()
                .uri("/demo02/name/stream")
                .responseContent()
                .asString()
                .next(); // convert Flux into Mono

    }

    public Flux<Integer> getPriceChanges() {
        return this.httpClient.get()
                .uri("/demo02/stock/stream")
                .responseContent()
                .asString()
                .map(Integer::parseInt);
    }

}
