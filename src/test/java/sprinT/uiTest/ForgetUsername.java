package sprinT.uiTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import configuration.BaseFramework;
import loggerlogall.DataLogger;
import sprinT.utilities.WebElementActions;

public class ForgetUsername extends BaseFramework {
	public static final Logger l = Logger.getLogger(DataLogger.class.getName());

	@Test
	public void VerifyHomePageTitle() {
		WebElementActions.driver.get("https://duckduckgo.com/");
		getCurrentPageTitle("DuckDuckGo — Privacy, simplified.");
		l.info("DuckDuckGo Title Matched");
	}
}
