package com.repgen.message;

import com.repgen.service.FileGenerator;
import com.repgen.writer.CostSheetWriter;
import com.repgen.writer.FundStructureWriter;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;

@Component("fundstructureMsgProcessor")
public class FundStructureMessageProcessor {

    @Resource(name="fileGenerator")
    FileGenerator fileGenerator;

    @Async("costSheetFundStructureExecutor")
    public String processMessage(String message) {
        System.out.println (Thread.currentThread().getName().concat("MAIN DUDE"));
        CompletableFuture<String> b1 = null;
        CompletableFuture<String> b2 = null;



        try {

            b1 = fileGenerator.generateCostSheetFile();
            b2 = fileGenerator.generateFundStructureFile();

            CompletableFuture.allOf(b1, b2).join();

        } catch (TaskRejectedException e) {
            System.out.println("Thread full baby");
        } catch (Exception e) {
            System.out.println("oops");

        }
        return null;

    }
}
