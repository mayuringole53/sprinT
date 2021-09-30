package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import sprinT.utilities.WebElementActions;

public class UserChallanDetailsPage {

	WebDriver driver;

	public UserChallanDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@id='cancelChallanData']")
	WebElement iAgreebtn;

	@FindBy(css = ".nav-link")
	WebElement homebtn;

	@FindBy(css = ".ml-2.btn.btn-danger.btn-sm")
	WebElement viewChallanGuidelinesbtn;

	@FindBy(css = ".float-right.btn.btn-success.btn-sm")
	WebElement addChallanDetailsbtn;

	@FindBy(css = "input#challanDate")
	WebElement transactionDepositDatetxt;

	@FindBy(css = "input#challanBranchCode")
	WebElement challanBranchCodetxt;

	@FindBy(css = "input#challanTransactionId")
	WebElement challanTransactionIdtxt;

	@FindBy(css = "input#challanConfirmTransactionId")
	WebElement challanConfirmTransactionIdtxt;

	@FindBy(css = "input#challanConfirm")
	WebElement challanConfirmchbox;

	@FindBy(css = "button#submitChallanData")
	WebElement submitChallanDatabtn;

	@FindBy(css = "button#cancelChallanData")
	WebElement cancelChallanDatabtn;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/button[2]")
	WebElement printReceiptbtn;

	@FindBy(xpath = "//*[@id='printData']/div[1]/table/tbody/tr[21]/td/ul/li[3]/a")
	WebElement homePageLink;

	/*
	 * @FindBy(xpath = "") WebElement savebtn;
	 * 
	 * @FindBy(xpath = "") WebElement cancelbtn;
	 */

	public void iAgree(WebElement element, WebElementActions clickMe) {
		iAgreebtn.click();
	}

	public void homePage() {
		homebtn.click();
	}

	public void viewChallanGuidelines() {
		viewChallanGuidelinesbtn.click();
	}

	public void addChallanDetails(String date, int branchCode, int transactionId, int confirmId) {
		addChallanDetailsbtn.click();
		transactionDepositDatetxt.sendKeys("23/02/1992");
		challanBranchCodetxt.sendKeys("12345");
		challanTransactionIdtxt.sendKeys("211");
		challanConfirmTransactionIdtxt.sendKeys("211");
		challanConfirmchbox.click();
		submitChallanDatabtn.click();
	}

	public void printReceipt() {
		printReceiptbtn.click();
	}

	public void homePageLink() {
		homePageLink.click();
	}
}
