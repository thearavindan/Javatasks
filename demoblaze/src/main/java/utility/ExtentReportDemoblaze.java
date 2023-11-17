package utility;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoblaze {
	
	public static ExtentReports getreport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\Aravind\\eclipse-workspace\\demoblaze\\reports\\report.html");
		reporter.config().setReportName("demoblaze test");
		reporter.config().setDocumentTitle("test reports");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
		
	}
	
	


}
