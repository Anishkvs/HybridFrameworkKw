package com.stc.runner;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import com.STCWeb.reporting.AutomationReports;
import com.stc.base.AutomationBase;
import com.stc.keywords.Keywords;

//@Listeners(AutomationReports.class)

public class TestRunner extends AutomationBase {

	@BeforeClass
	@Parameters({ "browserName" })
	public void setUp(String browserName) throws IOException {
		startBrowserSession(browserName);
		String applicationurl = new Keywords().getPropertyValue("Config", "applicationurl");
		new Keywords().loadUrl(driver, applicationurl);

	}

}
