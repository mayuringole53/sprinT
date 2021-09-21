package com.ydcc.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.HomePage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class HomePageTests extends BaseFramework {
	WebElementActions act = new WebElementActions();
	WebDriver driver = WebElementActions.driver;

	@Test
	public void verifyLogin() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);

		home.enterUserName("mayur");
		home.enterPassword("1234");
		home.clickOnSignInBtn();
		act.verifyTitle("User Home");
		System.out.println("Login Success");
	}
	
	@Test
	public void verifyNewRegistrationButton() {
		home.clickOnNewRegistrationBtn();
		act.verifyTitle("Instruction Page");
	}
	
	@Test
	private void verifyForgetUserNameLink() {
		home.clickOnForgetUserNameLink();
		act.verifyTitle("Forget UserName");
	}
	
	@Test
	private void verifyForgetPasswordLink() {
		home.clickOnForgetPasswordLink();
		act.verifyTitle("Forget Password");
	}
}
