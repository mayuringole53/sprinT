package com.ydcc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPrintPage {

	@FindBy(css = ".button-hide.btn.btn-success.ml-2.mt-2.btn-sm")
	WebElement printAppbtn;

	@FindBy(css = ".button-hide.btn.btn-primary.btn-sm.ml-2.mt-2")
	WebElement homebtn;

	public void printApplication() {
		printAppbtn.click();
	}

	public void homeBtn() {
		homebtn.click();
	}
}
