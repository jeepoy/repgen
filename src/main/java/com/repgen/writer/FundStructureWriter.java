package com.repgen.writer;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component("fundStructureWriter")
public class FundStructureWriter {


    public String writeFile(String data) throws InterruptedException {

        return data;

    }
}
