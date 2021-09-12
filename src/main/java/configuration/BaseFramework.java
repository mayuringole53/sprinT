package configuration;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import sprinT.utilities.WebElementActions;

public class BaseFramework {

	
	
	@BeforeMethod
	public void openBrowser() {
		WebElementActions.browsers("Chrome");
	}

	@AfterMethod
	public void closeBrowser() {
		WebElementActions.driver.quit();
	}

	public static String getCurrentPageTitle(String expectedTitle) {
		String actualTitle = WebElementActions.driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		return expectedTitle;
	}

}
