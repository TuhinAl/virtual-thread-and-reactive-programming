package com.altuhin.reactive.sec02;

import com.altuhin.reactive.common.Util;
import com.altuhin.reactive.sec02.client.ExternalServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec11NonBlockingIO {
    private static final Logger log = LoggerFactory.getLogger(Lec11NonBlockingIO.class);
    public static void main(String[] args) {
        /**
         * Ensure that External service is up and running
         */
        ExternalServiceClient serviceClient = new ExternalServiceClient();
        log.info("starting...");
        for (int i = 1; i < 5; i++) {
            serviceClient
                    .getProductName(i)
                    .subscribe(Util.subscriber());
        }

        Util.sleepSeconds(2);

    }
}
