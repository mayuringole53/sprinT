package com.ydcc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.ApplicationPrintPage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class ApplicationPrintPageTest extends BaseFramework {

	WebElementActions act1 = new WebElementActions();

	@Test
	public void printApplicationTest() {
		ApplicationPrintPage app = PageFactory.initElements(WebElementActions.driver, ApplicationPrintPage.class);
		app.printApplication();
	}

	@Test
	public void homeBtnTest() {
		ApplicationPrintPage app = PageFactory.initElements(WebElementActions.driver, ApplicationPrintPage.class);
		app.homeBtn();
		act1.verifyTitle("Yavatmal District Central Co-Operative Bank Limited");
		System.out.println("Title Matching");
	}

}
