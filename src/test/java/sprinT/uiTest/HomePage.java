package sprinT.uiTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configuration.BaseFramework;
import loggerlogall.DataLogger;
import sprinT.utilities.Elements;
import sprinT.utilities.WebElementActions;

public class HomePage extends BaseFramework {
	static String projectLocation = System.getProperty("user.dir");
	public static final Logger l = Logger.getLogger(DataLogger.class.getName());
	static String CFile = projectLocation + "/Log4j.properties";

	@BeforeClass
	public static void getlogger() {
		System.out.println(CFile);
		PropertyConfigurator.configure(CFile);
	}

	@Test
	public void VerifyHomePageTitle() {
		WebElementActions.driver.get("https://duckduckgo.com/");
		getCurrentPageTitle("DuckDuckGo — Privacy, simplified.");
		l.info("DuckDuckGo Title Matched");
	}

	@Test
	public void verifySearchButton() {
		WebElementActions.driver.get("https://duckduckgo.com/");
		WebElementActions.sendKeysHere("css", "input[type='text']", "Java");
		WebElementActions.clickMe("css", "input[type='submit']");
	}
}
