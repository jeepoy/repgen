package com.repgen.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.repgen.model.User;
import com.repgen.reportTemplates.ReportTemplate;
import com.repgen.service.UserService;

@Controller
public class ReportController {
	
	@Resource(name = "repgen_CSVGenerator")
	ReportTemplate csvGenerator;
	
	@RequestMapping(value = "/generate/xlsx", method = RequestMethod.GET, produces = "application/vnd.ms-excel")
	@ResponseBody
	public void generateXlsx(HttpServletResponse response) throws IOException, Exception  {
		
		response.setContentType("application/vnd.ms-excel");
		response.addHeader("Content-Disposition", "attachment; filename=blah.xlsx");

		response.getOutputStream().write(csvGenerator.generateReport(null));
		
		
	}
	

}
