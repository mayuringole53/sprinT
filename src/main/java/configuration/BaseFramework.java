package configuration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sprinT.utilities.WebElementActions;

public class BaseFramework {

	@BeforeMethod
	public void openBrowser() {
		WebElementActions.browsers("Chrome", "http://143.110.249.55/");
	}

	@AfterMethod
	public void closeBrowser() {
		WebElementActions.driver.quit();
	}

}
