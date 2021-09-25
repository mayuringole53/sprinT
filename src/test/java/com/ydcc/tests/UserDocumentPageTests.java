
package com.ydcc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.HomePage;
import com.ydcc.pages.UserDocumentPage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class UserDocumentPageTests extends BaseFramework{
	WebElementActions act1 = new WebElementActions();
		
	@Test
	public void verifyHomeBtn() {
		UserDocumentPage udp = PageFactory.initElements(WebElementActions.driver, UserDocumentPage.class);
		udp.clickOnHomeBtn();
		act1.verifyTitle("Yavatmal District Central Co-Operative Bank Limited");
		System.out.println("Title Matching");
	}
		
	@Test
	public void verifyLogoutBtn() {
		UserDocumentPage udp = PageFactory.initElements(WebElementActions.driver, UserDocumentPage.class);
		udp.clickOnLogoutBtn();
		act1.verifyTitle("Yavatmal District Central Co-Operative Bank Limited");
		System.out.println("Logout done");	    
	}
		
	@Test
	public void verifyImageUploadBtn(){
		UserDocumentPage udp = PageFactory.initElements(WebElementActions.driver, UserDocumentPage.class);
		udp.imageUploadBtn();
		System.out.println("Image uploaded successful");
	}
		
	@Test
	public void signUploadBtn(){
		UserDocumentPage udp = PageFactory.initElements(WebElementActions.driver, UserDocumentPage.class);
		udp.signUploadBtn();
		System.out.println("Sign uploaded successful");
	}
		
	@Test
	public void clickOnSubmitBtn(){
		UserDocumentPage udp = PageFactory.initElements(WebElementActions.driver, UserDocumentPage.class);
		udp.clickOnSubmitBtn();
		//here pop up how to check
		act1.verifyTitle("Documents saved successfully");
		System.out.println("Clicked on submit");
	}
		
	@Test
	public void clickOnBackBtn(){
		UserDocumentPage udp = PageFactory.initElements(WebElementActions.driver, UserDocumentPage.class);
		udp.clickOnBackBtn();
		act1.verifyTitle("User Eduction Details");
		System.out.println("On Previous page successfull we switch");
	}
}
