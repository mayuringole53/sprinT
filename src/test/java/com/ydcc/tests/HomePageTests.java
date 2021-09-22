package com.ydcc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.HomePage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class HomePageTests extends BaseFramework {
	WebElementActions act = new WebElementActions();

	@Test
	public void verifyLogin() {
		HomePage home = PageFactory.initElements(WebElementActions.driver, HomePage.class);
		home.enterUserName("24843");
		home.enterPassword("FMUGYVGA");
		home.clickOnSignInBtn();
		act.verifyTitle("User Home");
		System.out.println("Login Success");
	}

	@Test
	public void verifyNewRegistrationButton() {
		HomePage home = PageFactory.initElements(WebElementActions.driver, HomePage.class);
		home.clickOnNewRegistrationBtn();
		act.verifyTitle("Instruction Page");
	}

	@Test
	private void verifyForgetUserNameLink() {
		HomePage home = PageFactory.initElements(WebElementActions.driver, HomePage.class);
		home.clickOnForgetUserNameLink();
		act.verifyTitle("Forget UserName");
	}

	@Test
	private void verifyForgetPasswordLink() {
		HomePage home = PageFactory.initElements(WebElementActions.driver, HomePage.class);
		home.clickOnForgetPasswordLink();
		act.verifyTitle("Forget Password");
	}
}
