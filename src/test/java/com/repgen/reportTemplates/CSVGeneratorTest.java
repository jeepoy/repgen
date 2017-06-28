package com.repgen.reportTemplates;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CSVGeneratorTest {
	
	@Resource(name = "repgen_CSVGenerator")
	ReportTemplate csvGenerator;
	
	@Test
	public void generateCSVtest() throws Exception {
		csvGenerator.generateReport(null);
		
		
		
	}
}
