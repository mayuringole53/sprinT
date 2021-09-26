package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import sprinT.utilities.WebElementActions;


public class ForgetUsernamePage {
	WebDriver driver=WebElementActions.driver;

//	public ForgetUsernamePage(WebDriver idriver) {
//		this.driver=idriver;
//	}
	@FindBy(css="input#addDhr")WebElement adharTxtBox; 
	@FindBy(css="input#mobile")WebElement mobileTxtBox;
	@FindBy(css="button#recoverPassword")WebElement getUsernameBtn;
	@FindBy(css="a.form-control.btn.btn-outline-primary")WebElement goToHomebtn;
	
	public void forgetUsernameVerification(String adhar,String mobileno) {
		adharTxtBox.sendKeys(adhar);
		mobileTxtBox.sendKeys(mobileno);
		getUsernameBtn.click();
}
	public void clickOnHomePage() {
		goToHomebtn.click();
	}}