package com.ydcc.tests;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ydcc.pages.InstructionPage;
import configuration.BaseFramework;
import sprinT.utilities.HandlePDF;
import sprinT.utilities.WebElementActions;

public class InstructionPageTests extends BaseFramework {
	WebElementActions act = new WebElementActions();

	@Test(groups = { "Other" })
	public void verifyHomeBtn() {
		InstructionPage inst = PageFactory.initElements(WebElementActions.driver, InstructionPage.class);
		inst.clickOnHomeBtn();
		act.verifyTitle("Yavatmal District Central Co-Operative Bank Limited");
	}

	@Test(groups = { "Other" })
	public void verifyViewInformationBulletinBtn() throws InterruptedException, IOException {
		InstructionPage inst = PageFactory.initElements(WebElementActions.driver, InstructionPage.class);
		inst.clickOnViewInformationBulletinBtn();
		act.switchwindow();
		HandlePDF.testVerifyPDFInURL();
		int pagescount = HandlePDF.getPageCountUsingURL("http://143.110.249.55/recruitment-advertisement.pdf");
		System.out.println("Number of pages: " + pagescount);
	}

	@Test(groups = { "Other" })
	public void officialSiteLink() throws InterruptedException {
		InstructionPage inst = PageFactory.initElements(WebElementActions.driver, InstructionPage.class);
		inst.clickOnOfficialSiteLink();
		Thread.sleep(1000);
		act.verifyTitle("Yavatmal District Central Co-Operative Bank Limited");
	}

	@Test(groups = { "Smoke" })
	public void verifyToProceedNewRegistration() throws InterruptedException {
		InstructionPage inst = PageFactory.initElements(WebElementActions.driver, InstructionPage.class);
		inst.tickIAgreeCheckBox();
		Thread.sleep(1000);
		inst.clickOnClickHereToProceedBtn();
		Thread.sleep(1000);
		act.verifyTitle("file:///C:/new-registration");
		// act.verifyTitle("New User Registration");
	}

	@Test(groups = { "Other" })
	public void demoOfDownloadPDF() throws InterruptedException {
		HandlePDF.downloadPdf("https://git-scm.com/book/en/v2", "xpath",
				"//a[@href = 'https://github.com/progit/progit2/releases/download/2.1.331/progit.pdf']");
	}
}
