package com.altuhin.reactive.sec03;

import com.altuhin.reactive.common.Util;
import com.altuhin.reactive.sec03.helper.NameGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec07FluxVsList {
    private static final Logger log = LoggerFactory.getLogger(Lec07FluxVsList.class);

    public static void main(String[] args) {

//        System.out.println(NameGenerator.generateNameList(10));

        NameGenerator.generateNameFlux(10).subscribe(Util.subscriber());
    }
}
