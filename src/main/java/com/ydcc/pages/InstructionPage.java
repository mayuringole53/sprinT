package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstructionPage {
	WebDriver driver;

	public InstructionPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "a.nav-link")
	WebElement clickOnHomeBtn;

	@FindBy(xpath = "//*[contains(text(),'New Registration')]")
	WebElement clickForNewRegistrationBtn;

	@FindBy(xpath = "//i[@class='fa fa-download mr-1']")
	WebElement viewInformationBulletinBtn;

	@FindBy(xpath = "//a[contains(text(), ' https://www.ydcc.in/')]")
	WebElement officialSiteLink;

	@FindBy(css = "input#i-agree")
	WebElement iAgreeCheckBox;

	@FindBy(css = "button#proccessNewReg")
	WebElement clickHereToProceedBtn;

	public void clickOnHomeBtn() {
		clickOnHomeBtn.click();
	}

	public void clickOnNewRegistrationBtn() {
		clickForNewRegistrationBtn.click();
	}

	public void clickOnViewInformationBulletinBtn() {
		viewInformationBulletinBtn.click();
	}

	public void clickOnOfficialSiteLink() {
		officialSiteLink.click();
	}

	public void TickIAgreeCheckBox() {
		iAgreeCheckBox.click();
	}

	public void clickOnClickHereToProceedBtn() {
		clickHereToProceedBtn.click();
	}
}
