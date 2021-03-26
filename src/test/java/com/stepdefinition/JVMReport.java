package com.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateReport(String jsonfile) {
		Configuration c=new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"), "Booking");
		
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Browser version", "89");
		c.addClassifications("Sprint", "43");		
		c.addClassifications("OS", "Windows 8");
		List<String> jsonfiles= new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder r=new ReportBuilder(jsonfiles, c);
          r.generateReports();
		
		
	
	
	}

}
