package com.repgen.writer;

import org.springframework.core.task.TaskRejectedException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


import java.util.concurrent.CompletableFuture;

@Component("costSheetWriter")
public class CostSheetWriter {


    public String writeFile(String data) throws InterruptedException {

        return data;

    }
}
