package com.repgen.config;

import com.repgen.message.FundStructureMessageProcessor;
import com.repgen.writer.CostSheetWriter;
import org.apache.commons.lang3.concurrent.ConcurrentException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@Configuration
@EnableScheduling
@EnableAsync
public class GeneralConfig {

    @Resource(name="fundstructureMsgProcessor")
    private FundStructureMessageProcessor fsMsgProcessor;

    @Bean(name="costSheetFundStructureExecutor")
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("GithubLookup-");
        executor.initialize();
        return executor;
    }

    @Scheduled(fixedDelay = 30000, initialDelay = 1000)
    public void scheduleFixedRateWithInitialDelayTask() throws InterruptedException, ExecutionException {

        fsMsgProcessor.processMessage("blah");
    }


}
