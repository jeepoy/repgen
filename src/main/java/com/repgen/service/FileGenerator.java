package com.repgen.service;

import com.repgen.writer.CostSheetWriter;
import com.repgen.writer.FundStructureWriter;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;

@Component("fileGenerator")
public class FileGenerator {


    @Resource(name="costSheetWriter")
    CostSheetWriter costSheetWriter;

    @Resource(name="fundStructureWriter")
    FundStructureWriter fundStructureWriter;

    @Async("costSheetFundStructureExecutor")
    public CompletableFuture<String> generateCostSheetFile() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName().concat("CostSheet 1"));
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName().concat("CostSheet 2"));
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName().concat("CostSheet 3"));
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName().concat("CostSheet 4"));

        costSheetWriter.writeFile("costsheet File writing");
        return CompletableFuture.completedFuture("costSheet");
    }

    @Async("costSheetFundStructureExecutor")
    public CompletableFuture<String> generateFundStructureFile() throws InterruptedException {


        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName().concat("FundStructure 1"));
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName().concat("FundStructure 2"));
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName().concat("FundStructure 3"));
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName().concat("FundStructure 4"));

        fundStructureWriter.writeFile("fundstructure file writing");
        return CompletableFuture.completedFuture("fundStructure");
    }
}
