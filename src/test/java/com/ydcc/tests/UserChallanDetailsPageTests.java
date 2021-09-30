package com.ydcc.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.EducationalDetailsPage;
import com.ydcc.pages.UserChallanDetailsPage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class UserChallanDetailsPageTests extends BaseFramework {

	WebElementActions act1 = new WebElementActions();
	
	@Test
	public void iAgreeTest(WebElement iAgreebtn) {
		
		JavascriptExecutor jse=(JavascriptExecutor)WebElementActions.driver;
		jse.executeScript("arguments[0].click()" , iAgreebtn);
		
	}
	
	@Test
	public void homePageTest(){
		UserChallanDetailsPage ucdp=PageFactory.initElements(WebElementActions.driver,UserChallanDetailsPage.class);
		ucdp.homePage();
		act1.verifyTitle("Yavatmal District Central Co-Operative Bank Limited");
		System.out.println("Title Matching");
		
	}
	
	@Test
	public void viewChallanGuidelinesTest(){
		UserChallanDetailsPage ucdp=PageFactory.initElements(WebElementActions.driver,UserChallanDetailsPage.class);
		ucdp.viewChallanGuidelines();
	}
	
	@Test
	public void addChallanDetailsTest(){
		UserChallanDetailsPage ucdp=PageFactory.initElements(WebElementActions.driver,UserChallanDetailsPage.class);
		ucdp.addChallanDetails("22/02/1992",12345,211,211);
		
	}
	
	@Test
	public void printReceiptTest(){
		UserChallanDetailsPage ucdp=PageFactory.initElements(WebElementActions.driver,UserChallanDetailsPage.class);
		ucdp.printReceipt();
	}
	
	@Test
	public void homePageLinkTest(){
		UserChallanDetailsPage ucdp=PageFactory.initElements(WebElementActions.driver,UserChallanDetailsPage.class);
		ucdp.homePageLink();
		act1.verifyTitle("Yavatmal District Central Co-Operative Bank Limited");
		System.out.println("Title Matching");
	}
}
