package com.repgen.reportTemplates;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;

import com.repgen.enums.ReportTypes;
import com.repgen.model.ReportItem;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.builder.component.Components;


@Component(value = "repgen_CSVGenerator")
public class CSVGenerator implements ReportTemplate {


	@Override
	public byte[] generateReport(ReportItem reportItem) throws Exception {
		
					
		
		
		BasicDataSource ds = new BasicDataSource();

		ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		ds.setUrl("jdbc:sqlserver://sebnsab.c39htfyaeo4d.ap-southeast-2.rds.amazonaws.com:1433;databaseName=repgen");
		ds.setUsername("admin");
		ds.setPassword("password");
		ds.setTestOnBorrow(true);
		ds.setValidationQuery("select 1");
		ds.setInitialSize(2);
		
		
		Connection con = DataSourceUtils.getConnection(ds); // your datasource

		
		JasperReportBuilder rep = DynamicReports.report();//a new report

		rep.columns(	Columns.column("User Name", "username", DataTypes.stringType()),
						Columns.column("Email", "email", DataTypes.stringType()));
		
		rep.title(Components.text("SimpleReportExample"));
		
		rep.setDataSource("select userName, email from users", con);


		
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();


		rep.toXlsx(byteArray);

		return byteArray.toByteArray();

		
	}

	@Override
	public ReportTypes reportType() {
		return ReportTypes.CSV; 	
	}
	
	
}
