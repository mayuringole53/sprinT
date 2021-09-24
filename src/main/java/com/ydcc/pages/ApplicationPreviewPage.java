package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPreviewPage {
	WebDriver driver;

	public ApplicationPreviewPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "input#chkPhoto")
	WebElement checkPhotoChkBx;

	@FindBy(css = "input#chkIagree")
	WebElement checkIAgreeChkBx;

	@FindBy(css = "input#chkSignature")
	WebElement checkSignatureChkBx;

	@FindBy(css = "input#chkIagreeTip")
	WebElement checkIAgreeTipChkBx;

	@FindBy(css = "button#submitPreview")
	WebElement submitPreviewBtn;
	
	@FindBy(css = "button.swal2-confirm.swal2-styled")
	WebElement popupAfterSubmitBtn;

	@FindBy(css = "button#back")
	WebElement backBtn;

	@FindBy(css = "button#submituploadDetails")
	WebElement submitUploadDetailsBtn;

	public void checkPhotoChkBx() {
		checkPhotoChkBx.click();
	}

	public void checkIAgreeChkBx() {
		checkIAgreeChkBx.click();
	}

	public void checkSignatureChkBx() {
		checkSignatureChkBx.click();
	}

	public void checkIAgreeTipChkBx() {
		checkIAgreeTipChkBx.click();
	}

	public void submitPreviewBtn() {
		submitPreviewBtn.click();
	}

	public void popupAfterSubmitBtn() {
		popupAfterSubmitBtn.click();
	}
	
	public void backBtn() {
		backBtn.click();
	}

	public void submitUploadDetailsBtn() {
		submitUploadDetailsBtn.click();
	}

}
