package com.ydcc.tests;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.ForgetUsernamePage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class ForgetUsernameTest extends BaseFramework {
	//private static final WebDriver driver = null;
	
	

	@Test
	public void verifyForgetUsername() {
		ForgetUsernamePage fup = PageFactory.initElements(WebElementActions.driver, ForgetUsernamePage.class);
		//driver.findElement(By.cssSelector("a[href*='username']")).click();
		fup.forgetUsernameVerification("123456789123", "7777777777");
	}

	@Test
	public void verifyHomePageBtn() {
		ForgetUsernamePage fup = PageFactory.initElements(WebElementActions.driver, ForgetUsernamePage.class);
		fup.clickOnHomePage();
	}

}
