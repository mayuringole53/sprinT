package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserRegistrationPage {
	WebDriver driver;

	public NewUserRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "[name='newAadharNumber']")
	WebElement AadhaarNumberTxtBx;

	@FindBy(css = "[name='checkAddhar']")
	WebElement ConfirmAadhaarNumberTxtBx;

	@FindBy(css = "[name='newPanCard']")
	WebElement PANCardTxtBx;

	@FindBy(css = "[name='checkPanCard']")
	WebElement ConfirmPANCardTxtBx;

	@FindBy(css = "[name='newFname']")
	WebElement FirstNameTxtBx;

	@FindBy(css = "[name='checkNewFname']")
	WebElement ConfirmFirstNameTxtBx;

	@FindBy(css = "[name='newMname']")
	WebElement MiddleNameTxtBx;

	@FindBy(css = "[name='checkNewMname']")
	WebElement ConfirmMiddleNameTxtBx;

	@FindBy(css = "[name='newLname']")
	WebElement LastNameTxtBx;

	@FindBy(css = "[name='checkNewLname']")
	WebElement ConfirmLastNameTxtBx;

	@FindBy(css = "[name='newMobileNumber']")
	WebElement MobileNumberTxtBx;

	@FindBy(css = "[name='checkNewMobileNumber']")
	WebElement ConfirmMobileNumberTxtBx;

	@FindBy(css = "[name='newAlternativeMobileNumber']")
	WebElement AlternativeMobileNumberTxtBx;

	@FindBy(css = "[name='newMailPartOne']")
	WebElement EmailIDPart1TxtBx;

	@FindBy(css = "[name='newMailPartTwo']")
	WebElement EmailIDPart2TxtBx;

	@FindBy(css = "[name='checkNewMailPartOne']")
	WebElement ConfirmEmailIDPart1TxtBx;

	@FindBy(css = "[name='checknewMailPartTwo']")
	WebElement ConfirmEmailIDPart2TxtBx;

	@FindBy(css = "button#verifyNewRegistration")
	WebElement clickOnVerifyDetailsBtn;

	@FindBy(css = "button.swal2-confirm.swal2-styled")
	WebElement popupAfterVerifyDetailsBtn;
	
	@FindBy(css = "i.fa.fa-floppy-o.mr-2")
	WebElement clickOnSubmitBtn;
	
	@FindBy(css = "button.swal2-confirm.swal2-styled")
	WebElement popupAfterSubmitBtn;

	public void enterAadhaarNumber(String AadhaarNumber) {
		AadhaarNumberTxtBx.sendKeys(AadhaarNumber);
	}

	public void enterConfirmAadhaarNumber(String ConfirmAadhaarNumber) {
		ConfirmAadhaarNumberTxtBx.sendKeys(ConfirmAadhaarNumber);
	}

	public void enterPANCard(String PANCard) {
		PANCardTxtBx.sendKeys(PANCard);
	}

	public void enterConfirmPANCard(String ConfirmPANCard) {
		ConfirmPANCardTxtBx.sendKeys(ConfirmPANCard);
	}

	public void enterFirstName(String FirstName) {
		FirstNameTxtBx.sendKeys(FirstName);
	}

	public void enterConfirmFirstName(String ConfirmFirstName) {
		ConfirmFirstNameTxtBx.sendKeys(ConfirmFirstName);
	}

	public void enterMiddleName(String MiddleName) {
		MiddleNameTxtBx.sendKeys(MiddleName);
	}

	public void enterConfirmMiddleName(String ConfirmMiddleName) {
		ConfirmMiddleNameTxtBx.sendKeys(ConfirmMiddleName);
	}

	public void enterLastName(String LastName) {
		LastNameTxtBx.sendKeys(LastName);
	}

	public void enterConfirmLastName(String ConfirmLastName) {
		ConfirmLastNameTxtBx.sendKeys(ConfirmLastName);
	}

	public void enterMobileNumber(String MobileNumber) {
		MobileNumberTxtBx.sendKeys(MobileNumber);
	}

	public void enterConfirmMobileNumber(String ConfirmMobileNumber) {
		ConfirmMobileNumberTxtBx.sendKeys(ConfirmMobileNumber);
	}

	public void enterAlternativeMobileNumber(String AlternativeMobileNumber) {
		AlternativeMobileNumberTxtBx.sendKeys(AlternativeMobileNumber);
	}

	public void enterEmailIDPart1(String EmailIDPart1) {
		EmailIDPart1TxtBx.sendKeys(EmailIDPart1);
	}

	public void enterEmailIDPart2(String EmailIDPart2) {
		EmailIDPart2TxtBx.sendKeys(EmailIDPart2);
	}

	public void enterConfirmEmailIDPart1(String ConfirmEmailIDPart1) {
		ConfirmEmailIDPart1TxtBx.sendKeys(ConfirmEmailIDPart1);
	}

	public void enterConfirmEmailIDPart2(String ConfirmEmailIDPart2) {
		ConfirmEmailIDPart2TxtBx.sendKeys(ConfirmEmailIDPart2);
	}

	public void clickOnVerifyDetailsBtn() {
		clickOnVerifyDetailsBtn.click();
	}
	
	public void confirmPopupAfterVerifyDetailsBtn() {
		popupAfterVerifyDetailsBtn.click();
	}

	public void clickOnSubmitBtn() {
		clickOnSubmitBtn.click();
	}
	
	public void confirmPopupAfterSubmitBtn() {
		popupAfterSubmitBtn.click();
	}
	
	
}