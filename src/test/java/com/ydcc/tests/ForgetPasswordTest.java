package com.ydcc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.ForgetPasswordPage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class ForgetPasswordTest extends BaseFramework {
@Test
public void verifyForgetPassword() {
ForgetPasswordPage fpp=PageFactory.initElements(WebElementActions.driver, ForgetPasswordPage.class);
fpp.forgetPasswordVerification("1234","123456789123");
}
@Test
public void verifyHomePageBtn() {
	ForgetPasswordPage fpp=PageFactory.initElements(WebElementActions.driver, ForgetPasswordPage.class);
	fpp.goToHomePage();
}
}
