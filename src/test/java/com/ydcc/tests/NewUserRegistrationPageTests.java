package com.ydcc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.NewUserRegistrationPage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class NewUserRegistrationPageTests extends BaseFramework {
	WebElementActions act = new WebElementActions();

	@Test
	public void verifyDetailsOnNewUserRegPage() {
		NewUserRegistrationPage newRegPage = PageFactory.initElements(WebElementActions.driver,
				NewUserRegistrationPage.class);
		newRegPage.enterAadhaarNumber("111122223333");
		newRegPage.enterConfirmAadhaarNumber("111122223333");
		newRegPage.enterPANCard("CNTPB7081A");
		newRegPage.enterConfirmPANCard("CNTPB7081A");
		newRegPage.enterFirstName("Rohit");
		newRegPage.enterConfirmFirstName("Rohit");
		newRegPage.enterMiddleName("Naresh");
		newRegPage.enterConfirmMiddleName("Naresh");
		newRegPage.enterLastName("Sharma");
		newRegPage.enterConfirmLastName("Sharma");
		newRegPage.enterMobileNumber("9988776655");
		newRegPage.enterConfirmMobileNumber("9988776655");
		newRegPage.enterAlternativeMobileNumber("9876543210");
		newRegPage.enterEmailIDPart1("rohitsharma86");
		newRegPage.enterEmailIDPart2("gmail.com");
		newRegPage.enterConfirmEmailIDPart1("rohitsharma86");
		newRegPage.enterConfirmEmailIDPart2("gmail.com");
		newRegPage.clickOnVerifyDetailsBtn();
		// check pop up message.
		newRegPage.confirmPopupAfterVerifyDetailsBtn();

		newRegPage.clickOnSubmitBtn();
		newRegPage.confirmPopupAfterSubmitBtn();
		
		act.verifyTitle("New User Registration");
	}
}