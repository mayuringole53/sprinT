package com.ydcc.tests;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.InstructionPage;
import configuration.BaseFramework;
import sprinT.utilities.HandlePDF;
import sprinT.utilities.WebElementActions;

public class InstructionPageTests extends BaseFramework {
	WebElementActions act = new WebElementActions();

	@Test
	public void verifyHomeBtn() {
		InstructionPage inst = PageFactory.initElements(WebElementActions.driver, InstructionPage.class);
		inst.clickOnHomeBtn();
		act.verifyTitle("Yavatmal District Central Co-Operative Bank Limited");
	}

	@Test
	public void verifyViewInformationBulletinBtn() throws InterruptedException, IOException {
		InstructionPage inst = PageFactory.initElements(WebElementActions.driver, InstructionPage.class);
		inst.clickOnViewInformationBulletinBtn();
		Thread.sleep(1000);
		//HandlePDF.getPageCountUsingURL("http://143.110.249.55/recruitment-advertisement.pdf");
		
//		URL pdfUrl = new URL("http://143.110.249.55/recruitment-advertisement.pdf");
//		InputStream in = pdfUrl.openStream();
//		BufferedInputStream bf = new BufferedInputStream(in);
//		PDDocument doc = PDDocument.load(bf);
//		int numberOfPages = getPageCount(doc);
//		System.out.println("The total number of pages " + numberOfPages);
	}
//	private static int getPageCount(PDDocument doc) {
//		int pageCount = doc.getNumberOfPages();
//		return pageCount;
//	}

	@Test
	public void officialSiteLink() throws InterruptedException {
		InstructionPage inst = PageFactory.initElements(WebElementActions.driver, InstructionPage.class);
		inst.clickOnOfficialSiteLink();
		Thread.sleep(1000);
		act.verifyTitle("Instruction Page");
		//act.verifyTitle("www.ydcc.in");
	}

	@Test
	public void verifyToProceedNewRegistration() throws InterruptedException {
		InstructionPage inst = PageFactory.initElements(WebElementActions.driver, InstructionPage.class);
		inst.TickIAgreeCheckBox();
		Thread.sleep(1000);
		inst.clickOnClickHereToProceedBtn();
		Thread.sleep(1000);
		act.verifyTitle("file:///C:/new-registration");
		// act.verifyTitle("New User Registration");
	}

	@Test(enabled = false)
	public void demoOfDownloadPDF() throws InterruptedException {
		HandlePDF hp = new HandlePDF();
		Thread.sleep(2000);
		hp.downloadPdf("https://git-scm.com/book/en/v2", "xpath",
				"//a[@href = 'https://github.com/progit/progit2/releases/download/2.1.331/progit.pdf']");
	}
}
