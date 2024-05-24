package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import com.altuhin.reactive.sec03.client.ExternalServiceClient;
import com.altuhin.reactive.sec03.helper.NameGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec08NonBlockingStreamMessages {
    private static final Logger log = LoggerFactory.getLogger(Lec08NonBlockingStreamMessages.class);

    public static void main(String[] args) {

        ExternalServiceClient client = new ExternalServiceClient();
        client.getName().subscribe(Util.subscriber());
        Util.sleepSeconds(12);

    }
}
