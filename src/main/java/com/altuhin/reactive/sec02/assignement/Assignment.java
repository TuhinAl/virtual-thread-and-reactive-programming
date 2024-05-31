package com.altuhin.reactive.sec02.assignement;

import com.altuhin.reactive.common.Util;

public class Assignment {
    public static void main(String[] args) {
        FileServiceImpl fileService = new FileServiceImpl();

        fileService.write("test.txt",
                        "Bangladesh is a very beautiful country, Dhaka is the capital of Bdesh")
                .subscribe(Util.subscriber("WRITE"));

        fileService.read("test.txt")
                .subscribe(Util.subscriber("READ"));

        fileService.delete("test.txt")
                .subscribe(Util.subscriber("READ"));

    }
}
