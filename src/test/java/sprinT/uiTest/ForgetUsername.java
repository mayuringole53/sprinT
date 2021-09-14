package sprinT.uiTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import configuration.BaseFramework;
import loggerlogall.DataLogger;
import sprinT.utilities.WebElementActions;

public class ForgetUsername extends BaseFramework {
	public static final Logger LOG = Logger.getLogger(DataLogger.class.getName());

	@Test
	public void VerifyHomePageTitle1() {
		WebElementActions.driver.get("https://duckduckgo.com/");
		getCurrentPageTitle("DuckDuckGo — Privacy, simplified.");
		LOG.info("DuckDuckGo Title Matched");
	}
}
