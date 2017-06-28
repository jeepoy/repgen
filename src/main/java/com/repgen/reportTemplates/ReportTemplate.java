package com.repgen.reportTemplates;


import java.io.FileOutputStream;

import org.apache.commons.dbcp2.BasicDataSource;


import com.repgen.enums.ReportTypes;
import com.repgen.model.ReportItem;

public interface ReportTemplate {
	
	public abstract byte[] generateReport(ReportItem reportItem) throws Exception; 
	public abstract ReportTypes reportType();
	
}
