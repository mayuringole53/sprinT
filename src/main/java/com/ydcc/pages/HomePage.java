package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[contains(text(),'New Registration')]")
	WebElement clickForNewRegistrationBtn;

	@FindBy(xpath = "//div[@class='text-center ref-docuemnt']/p/a[@href='/how-to-apply']")
	WebElement howToApplyLink;

	@FindBy(css = "a[href*='advertise']")
	WebElement advertisementLink;

	@FindBy(css = "input[placeholder*='Username']")
	WebElement userNameTxtBx;

	@FindBy(css = "input[type=password]")
	WebElement passwordTxtBx;

	@FindBy(css = "button[type=submit]")
	WebElement signInBtn;

	@FindBy(xpath = "//*[contains(text(),'Forget Username')]")
	WebElement forgetUserNameLink;

	@FindBy(xpath = "//*[contains(text(),'Forget Password')]")
	WebElement forgetPasswordLink;

	public void clickOnHowToApplyLink() {
		howToApplyLink.click();
	}

	public void clickOnNewRegistrationBtn() {
		clickForNewRegistrationBtn.click();
	}

	public void clickOnForgetUserNameLink() {
		forgetUserNameLink.click();
	}

	public void clickOnForgetPasswordLink() {
		forgetPasswordLink.click();
	}

	public void enterUserName(String userName) {
		userNameTxtBx.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordTxtBx.sendKeys(password);
	}

	public void clickOnSignInBtn() {
		signInBtn.click();
	}
}
