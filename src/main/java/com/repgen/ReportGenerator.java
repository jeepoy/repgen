package com.repgen;


import com.repgen.model.UnitPriceCostSheet;
import com.repgen.model.UnitPriceCostSheet1;
import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.instrument.Instrumentation;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executor;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableAsync
@EnableScheduling
public class ReportGenerator {

	public static void main(String[] args) {





		UnitPriceCostSheet obj = new UnitPriceCostSheet();

		obj.setCellColumn("a");
		obj.setCellrow(100);
		obj.setExtractedDateTime(Calendar.getInstance().getTime());
		obj.setFundCode("AR");
		obj.setPortfolioCode("AR11");
		obj.setPricingPointeTime("21:00:00");
		obj.setPricingPointDate(Calendar.getInstance().getTime());
		obj.setValue(BigDecimal.valueOf(234234234));
		obj.setReportSet("MULTI");



		System.out.println( ObjectSizeCalculator.getObjectSize(obj));
		SpringApplication.run(ReportGenerator.class, args);

	}


}
