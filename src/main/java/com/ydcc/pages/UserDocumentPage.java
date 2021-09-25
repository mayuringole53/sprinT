
package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDocumentPage {
	WebDriver driver;

	public UserDocumentPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = ".nav-link")
	WebElement homebtn;

	@FindBy(css = ".btn.btn-danger.float-right.text-light.btn-sm")
	WebElement logoutbtn;

	@FindBy(css = ".navbar-brand.text-light.font-weight-bolder")
	WebElement navBarTitletxt;

	@FindBy(css = "//*[@id='collapsibleNavId']/div/span[2]/span")
	WebElement candidateNametxt;

	@FindBy(css = "//*[@id='collapsibleNavId']/div/span[2]/small")
	WebElement userNametxt;

	@FindBy(css = "//*[@id='collapsibleNavId']/div/span[3]/small")
	WebElement appliedPosttxt;// see xpath correct or not

	@FindBy(css = "#imageUpload")
	WebElement imageUploadbtn;

	@FindBy(css = "#signUpload")
	WebElement signUploadbtn;

	@FindBy(css = ".btn.btn-primary.pl-5.pr-5.ml-2.mr-2")
	WebElement submitbtn;

	@FindBy(css = ".float-left.ml-3.btn.btn-outline-secondary.pl-3.pr-3")
	WebElement backbtn;

	public void clickOnHomeBtn() {
		homebtn.click();
	}

	public void clickOnLogoutBtn() {
		logoutbtn.click();
	}

	public void imageUploadBtn() {
		imageUploadbtn.click();
	}

	public void signUploadBtn() {
		signUploadbtn.click();
	}

	public void clickOnSubmitBtn() {
		submitbtn.click();
	}

	public void clickOnBackBtn() {
		backbtn.click();
	}
}
