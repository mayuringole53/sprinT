package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordPage {
WebDriver driver;
public ForgetPasswordPage(WebDriver idriver) {
this.driver=idriver;
}
@FindBy (css="input#user") WebElement usernameTxtBox;
@FindBy(css="input#addhar") WebElement adharTxtBox;
@FindBy(css="button#verifyUserDetails")WebElement verifyDetailsBtn;
@FindBy(css="a.form-control.btn.btn-outline-primary")WebElement goToHomeBtn;
public void goToHomePage() {
goToHomeBtn.click();
}
public void forgetPasswordVerification(String user,String Adhar) {
usernameTxtBox.sendKeys(user);
adharTxtBox.sendKeys(Adhar);
verifyDetailsBtn.click();
}
}
