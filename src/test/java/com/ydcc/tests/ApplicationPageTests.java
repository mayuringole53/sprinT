package com.ydcc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ydcc.pages.ApplicationPreviewPage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class ApplicationPageTests extends BaseFramework {
	WebElementActions act = new WebElementActions();

	@Test
	public void verifyApplicationPreviewPage() {
		ApplicationPreviewPage appPreview = PageFactory.initElements(WebElementActions.driver,
				ApplicationPreviewPage.class);
		appPreview.checkPhotoChkBx();
		appPreview.checkIAgreeChkBx();
		appPreview.checkSignatureChkBx();
		appPreview.checkIAgreeTipChkBx();
		appPreview.submitPreviewBtn();
		appPreview.popupAfterSubmitBtn();
	}
}
