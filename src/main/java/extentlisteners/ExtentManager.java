package extentlisteners;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	static String reportPath = System.getProperty("user.dir") + "/Reports/";

	private static ExtentReports extent;
	
		    public static ExtentReports createInstance(String fileName) {
				DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
				Date date = new Date();
				String filePathdate = dateFormat.format(date).toString();
				String actualReportPath = reportPath + "index.html";
				new File(actualReportPath).renameTo(new File(
						System.getProperty("user.dir") + "/reports/" + "Automation_Report_" + filePathdate + ".html"));
		////////////////
//				ExtentReports , ExtentSparkReporter
				String path =System.getProperty("user.dir")+"//reports//index.html";

		    	ExtentSparkReporter htmlReporter = new ExtentSparkReporter(path);

	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Rachana Pathak", "");
	        extent.setSystemInfo("Organization", "STC Kw");
	        extent.setSystemInfo("Application", "STC - Web");
	        return extent;
	    }

	    
	  /*  public static String screenshotPath;
		public static String screenshotName;
		
		public static void captureScreenshot() {

			File scrFile = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

			Date d = new Date();
			screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

			try {
				FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\reports\\" + screenshotName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		}*/
	

	}
