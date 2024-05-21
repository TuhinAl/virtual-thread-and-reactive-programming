package com.altuhin.reactive.sec02.client;

import com.altuhin.reactive.common.AbstractHttpClient;
import reactor.core.publisher.Mono;

public class ExternalServiceClient extends AbstractHttpClient {


    public Mono<String> getProductName(int productID) {
      return   this.httpClient.get()
                .uri("/demo01/product/"+productID)
                .responseContent()
                .asString()
                .next(); // convert Flux into Mono

    }
}
