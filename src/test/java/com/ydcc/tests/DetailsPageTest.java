package com.ydcc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.DetailsPage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class DetailsPageTest extends BaseFramework {



	// WebElementActions web = new WebElementActions();

	@Test(enabled = false)
	public void verifyHomeBtn() {

		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.clickOnHomeBtn();

	}

	@Test
	public void verifyLogoutBtn() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.clickOnLogoutBtn();
	}

	@Test
	public void verifyVerifyDetailsBtn() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.clickOnVerifyDetails();
	}

	@Test (dependsOnMethods= {"verifyVerifyDetailsBtn"},enabled = false)
	public void verifyOkBtn() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.clickOnOkBtn();
	}

	@Test(enabled = false)
	private void verifySubmitBtn() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.clickOnSubmitBtn();
	}

	@Test(enabled = false)
	public void verifyExServiceDetails() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.addExServiceDetails("2", "3");
	}

	@Test
	public void verifyDepartment() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.selectDepartment("Yavatmal District Central Co-Operative Bank");
	}

	@Test (dependsOnMethods= {"verifyDepartment"},enabled = false)
	public void verifyPost() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.selectPost("कनिष्ठ लिपीक");
	}

	@Test
	private void verifyBirthDate() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.selectDate("15", "10", "1998");
	}

	@Test
	private void verifyAge() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.displayAge();
	}

	@Test
	private void verifyGender() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.addGender("female");
	}

	@Test
	private void VerifyMaritalStatus() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.addMaritalStatus("married");
	}

	@Test
	private void verifyCategory() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.addCategory("NTB");
	}

	@Test
	private void verifySubCategory() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.readSubCategory("Mali");
	}

	@Test
	private void verifyNCL() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.nclAvailability("yes");
	}

	@Test
	private void verifyReligion() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.selectReligion("Hindu");
	}

	@Test(enabled = false)
	private void verifySammanter() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.selectSammanter("9");
	}

	@Test
	private void verifyNationality() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.nationalityAvailability("yes");
	}

	@Test
	private void verifyDomiciled() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.domicileAvailability("yes");
	}

	@Test
	private void verifyFatherName() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.readFatherName();
	}

	@Test
	private void verifyMotherName() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.addMotherName("Riya");
	}

	@Test
	private void verifySpouseName() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.addSpouseName("Prashant");
	}

	@Test(enabled = false)
	private void verifyAddress() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.readAddress("Mundhawa", "Hadapsar", "Haveli", "Maharashtra", "Pune", "412228");
	}

	@Test
	private void verifyMarathiLanguageKnown() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.marathiLangKnownRead();
		dp.marathiLangKnownWrite();
		dp.marathiLangKnownSpeak();
	}

	@Test
	private void verifyEnglishLanguageKnown() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.englishLangKnownRead();
		dp.englishLangKnownWrite();
		dp.englishLangKnownSpeak();
	}

	@Test
	public void addOtherLanguageKnown() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.enterOtherLang("Hindi");
	}

	@Test(dependsOnMethods = { "addOtherLanguageKnown" },enabled = false)
	private void verifyOtherLanguageKnown() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.otherLangKnownRead();
		dp.otherLangKnownWrite();
		dp.otherLangKnownSpeak();
	}

	@Test
	private void verifyDisability() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.checkDiasability("yes");
	}

	@Test
	private void verifyFreedomFighter() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.checkIsFreedomFighterChild("no");
	}

	@Test
	private void verifyProjectAffected() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.checkProjectAffectedCandidate("no");
	}

	@Test
	private void verifyEarthQuakeAffected() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.CheckEarthQuakeAffectedCandidate("no");
	}

	@Test
	private void verifyMarioriousSport() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.checkMeritoriousSportPerson("no");
	}

	@Test
	private void verifyDefenseService() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.checkDeadInDefenseService("no");
	}

	@Test
	private void verifyProsecutionAgainstYou() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.addJDPendingInCourt("no");
	}

	@Test
	private void verifyOtherDiscuplinary() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.addJDPendingDisciplinaryOtherAction("no");
	}

	@Test
	private void verifyDisciplinaryByGov() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.checkJDPendindDisciplinaryActionByGov("no");
	}

	@Test
	private void verifyCourtCase() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.checkCourtCaseFiled("no");
	}

	@Test
	private void vrifyBlackListed() {
		DetailsPage dp = PageFactory.initElements(WebElementActions.driver, DetailsPage.class);
		dp.checkBlackListed("no");
	}

}