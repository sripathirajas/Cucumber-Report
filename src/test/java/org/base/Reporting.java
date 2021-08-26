package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static void JVMreportGeneration(String json) {
		File file = new File("C:\\Users\\srira\\eclipse-workspace\\SriRam\\Raja\\SriPathi\\CucumberTable\\Reporting");
		
		Configuration configuration = new Configuration(file, "Adactin");
		configuration.addClassifications("Platform", "Windows-10");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Sprint No", "6");
		
		List<String> list = new ArrayList<String>();
		list.add(json);
		
		ReportBuilder builder = new ReportBuilder(list, configuration);
		builder.generateReports();
		

	}

}
