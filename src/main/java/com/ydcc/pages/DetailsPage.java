/**
 * 
 */
package com.ydcc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprinT.utilities.WebElementActions;

/**
 * @author admin
 *
 */
public class DetailsPage {
	WebDriver driver;
	WebElementActions web = new WebElementActions();

	public DetailsPage(WebDriver idriver) {
		this.driver = idriver;
	}

	@FindBy(css = "a[href='/home']")
	WebElement homeBtn;

	@FindBy(css = "a.btn.btn-danger.float-right.text-light.btn-sm")
	WebElement logoutBtn;

	@FindBy(css = "select#detailsMainPost")
	WebElement departmentDropDown;

	@FindBy(css = "select#detailsPost")
	WebElement postDropDown;

	@FindBy(css = "select#detailsbday")
	WebElement dateDropDown;

	@FindBy(css = "select#detailsmonth")
	WebElement monthDropDown;

	@FindBy(css = "select#detailsYear")
	WebElement yearDropDown;

	@FindBy(css = "p.setAgeText")
	WebElement ageas1july21;

	@FindBy(css = "input#male")
	WebElement maleRadioBtn;

	@FindBy(css = "input#female")
	WebElement femaleRadioBtn;

	@FindBy(css = "input#other")
	WebElement otherRadioBtn;

	@FindBy(css = "input#unmarried")
	WebElement unmarriedRadioBtn;

	@FindBy(css = "input#married")
	WebElement marriedRadioBtn;

	@FindBy(css = "input#other-1")
	WebElement other1RadioBtn;

	@FindBy(css = "input#sc")
	WebElement scRadioBtn;
	@FindBy(css = "input#st")
	WebElement stRadioBtn;

	@FindBy(css = "input#vja")
	WebElement vjaRadioBtn;

	@FindBy(css = "input#ntb")
	WebElement ntbRadioBtn;

	@FindBy(css = "input#ntd")
	WebElement ntdRadioBtn;

	@FindBy(css = "input#sbc")
	WebElement sbcRadioBtn;

	@FindBy(css = "input#obc")
	WebElement obcRadioBtn;

	@FindBy(css = "input#detailsSubCategory")
	WebElement subCatInBox;

	@FindBy(css = "input#detailsNonCreamyLayer1")
	WebElement nclYesRadioBtn;

	@FindBy(css = "input#detailsNonCreamyLayer0")
	WebElement nclNoRadioBtn;

	@FindBy(css = "select#detailsReligion")
	WebElement religionDropDown;

	@FindBy(css = "select#detailsSammanter")
	WebElement sammanterDropDown;

	@FindBy(css = "input#nationalityYes")
	WebElement NationYesRadioBtn;

	@FindBy(css = "input#nationalityNo")
	WebElement NationNoRadioBtn;

	@FindBy(css = "input#domicileYes")
	WebElement domicileYesRadioBtn;

	@FindBy(css = "input#domicileNo")
	WebElement domicileNoRadioBtn;

	@FindBy(css = "input#detailsFather")
	WebElement fatherNameTxtBox;

	@FindBy(css = "input#detailsMother")
	WebElement motherNameTxtBox;

	@FindBy(css = "input#detailsSpouse")
	WebElement spouseTxtBox;

	@FindBy(css = "input#detailsAddress")
	WebElement addressInBox;

	@FindBy(css = "input#detailsLineTwo")
	WebElement addLine2InBox;

	@FindBy(css = "input#detailsLineThree")
	WebElement addLine3InBox;

	@FindBy(css = "select#detailsState")
	WebElement stateDropDown;

	@FindBy(css = "input#detailsDistrict")
	WebElement distDropDown;

	@FindBy(css = "select#detailsPin")
	WebElement pincodeInBox;

	@FindBy(css = "input#marathiRead")
	WebElement marathiReadCheckBox;

	@FindBy(css = "input#marathiWrite")
	WebElement marathiWriteCheckBox;

	@FindBy(css = "input#marathiSpeak")
	WebElement marathiSpeakCheckBox;

	@FindBy(css = "input#englishRead")
	WebElement englishReadCheckBox;

	@FindBy(css = "input#englishWrite")
	WebElement englishWriteCheckBox;

	@FindBy(css = "input#englishSpeak")
	WebElement englishSpeakCheckBox;

	@FindBy(css = "input#detailsOtherLanguage")
	WebElement otherLangInBox;

	@FindBy(css = "input#otherRead")
	WebElement otherReadCheckBox;

	@FindBy(css = "input#otherWrite")
	WebElement otherWriteCheckBox;

	@FindBy(css = "input#otherSpeak")
	WebElement otherSpeakCheckBox;

	@FindBy(css = "input#candidateDisabilityY")
	WebElement DisableYesRadioBtn;

	@FindBy(css = "input#candidateDisabilityN")
	WebElement DisableNoRadioBtn;

	@FindBy(css = "select#detailsDisabilityType")
	WebElement disabilityDropDown;

	@FindBy(css = "input#candidateFreedomFighterChildY")
	WebElement candidateFreedomFighterChildYesRadioBtn;

	@FindBy(css = "input#candidateFreedomFighterChildN")
	WebElement candidateFreedomFighterChildNoRadioBtn;

	@FindBy(css = "input#candidateProjectAffectedY")
	WebElement candidateProjectAffectedYesRadioBtn;

	@FindBy(css = "input#candidateProjectAffectedN")
	WebElement candidateProjectAffectedNoRadioBtn;

	@FindBy(css = "input#candidateEarthquakeAffectedY")
	WebElement candidateEarthquakeAffectedYesRadioBtn;

	@FindBy(css = "input#candidateEarthquakeAffectedY")
	WebElement candidateEarthquakeAffectedNoRadioBtn;

	@FindBy(css = "input#candidateMeritoriousSportsY")
	WebElement candidateMeritoriousSportsYesRadioBtn;

	@FindBy(css = "input#candidateMeritoriousSportsN")
	WebElement candidateMeritoriousSportsNoRadioBtn;

	@FindBy(css = "input#candidateChildWifeServicemanDiedY")
	WebElement candidateChildWifeServicemanDiedYesRadioBtn;

	@FindBy(css = "input#candidateChildWifeServicemanDiedN")
	WebElement candidateChildWifeServicemanDiedNoRadioBtn;

	@FindBy(css = "input#candidateJDPendingInCourtY")
	WebElement candidateJDPendingInCourtYesRadioBtn;

	@FindBy(css = "input#candidateJDPendingInCourtN")
	WebElement candidateJDPendingInCourtNoRadioBtn;

	@FindBy(css = "input#candidateJDPendingDisciplinaryOtherSimilarActionY")
	WebElement candidateJDPendingDisciplinaryOtherSimilarActionYesRadioBtn;

	@FindBy(css = "input#candidateJDPendingDisciplinaryOtherSimilarActionN")
	WebElement candidateJDPendingDisciplinaryOtherSimilarActionNoRadioBtn;

	@FindBy(css = "input#candidateJDPendingDisciplinaryActionByGovY")
	WebElement candidateJDPendingDisciplinaryActionByGovYesRadioBtn;

	@FindBy(css = "input#candidateJDPendingDisciplinaryActionByGovN")
	WebElement candidateJDPendingDisciplinaryActionByGovNoRadioBtn;

	@FindBy(css = "input#candidateJDCourtCaseFiledY")
	WebElement candidateJDCourtCaseFiledYesRadioBtn;

	@FindBy(css = "input#candidateJDCourtCaseFiledN")
	WebElement candidateJDCourtCaseFiledNoRadioBtn;

	@FindBy(css = "input#candidateJDBlackListedY")
	WebElement candidateJDBlackListedYesRadioBtn;

	@FindBy(css = "input#candidateJDBlackListedN")
	WebElement candidateJDBlackListedNoRadioBtn;

	@FindBy(css = "button#verifyPersonalDetails")
	WebElement verifyBtn;
	@FindBy(css = "button.swal2-confirm.swal2-styled")
	WebElement okBtn;
	@FindBy(css = "input#detailsExServicemanYear")
	WebElement exServiceYear;
	@FindBy(css = "input#detailsExServicemanMonth")
	WebElement exServiceMonth;
	@FindBy(css = "button#submitPersonalDetails")
	WebElement submitBtn;

	public void clickOnOkBtn() {
		okBtn.click();
	}

	public void clickOnSubmitBtn() {
		submitBtn.click();
	}

	public void addExServiceDetails(String year, String month) {
		exServiceYear.sendKeys(year);
		exServiceMonth.sendKeys(month);
	}

	public void addJDPendingInCourt(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateJDPendingInCourtYesRadioBtn.click();
		else
			candidateJDPendingInCourtNoRadioBtn.click();
	}

	public void addJDPendingDisciplinaryOtherAction(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateJDPendingDisciplinaryOtherSimilarActionYesRadioBtn.click();
		else
			candidateJDPendingDisciplinaryOtherSimilarActionNoRadioBtn.click();
	}

	public void checkJDPendindDisciplinaryActionByGov(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateJDPendingDisciplinaryActionByGovYesRadioBtn.click();
		else
			candidateJDPendingDisciplinaryActionByGovNoRadioBtn.click();
	}

	public void checkCourtCaseFiled(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateJDCourtCaseFiledYesRadioBtn.click();
		else
			candidateJDCourtCaseFiledNoRadioBtn.click();
	}

	public void checkBlackListed(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateJDBlackListedYesRadioBtn.click();
		else
			candidateJDBlackListedNoRadioBtn.click();
	}

	public void clickOnHomeBtn() {

		homeBtn.click();
	}

	public void clickOnLogoutBtn() {
		logoutBtn.click();
	}

	public void selectDepartment(String deptName) {
		web.selectValueFromDropDownList(departmentDropDown, deptName);
	}

	public void selectPost(String postname) {
		web.selectValueFromDropDownList(postDropDown, postname);
	}

	public void selectDate(String date, String month, String year) {
		web.selectValueFromDropDownList(dateDropDown, date);
		web.selectValueFromDropDownList(monthDropDown, month);
		web.selectValueFromDropDownList(yearDropDown, year);
	}

	public void displayAge() {
		ageas1july21.getText();

	}

	public void readSubCategory(String caste) {
		subCatInBox.sendKeys(caste);

	}

	public void clickOnVerifyDetails() {
		verifyBtn.click();
	}

	public void selectReligion(String name) {
		web.selectValueFromDropDownList(religionDropDown, name);
	}

	public void selectSammanter(String value) {
		obcRadioBtn.click();
		if (obcRadioBtn.isSelected())
			web.selectValueFromDropDownList(sammanterDropDown, value);
	}

	public void readFatherName() {
		fatherNameTxtBox.getText();
	}

	public void addMotherName(String mothername) {

		motherNameTxtBox.sendKeys(mothername);
	}

	public void addSpouseName(String spousename) {
		if (unmarriedRadioBtn.isSelected())
			spouseTxtBox.getText();
		else
			spouseTxtBox.sendKeys(spousename);
	}

	public void addState(String state) {
		web.selectValueFromDropDownList(stateDropDown, state);
	}

	public void readAddress(String city, String area, String taluka, String state, String dist, String pin) {
		addressInBox.sendKeys(city);
		addLine2InBox.sendKeys(area);
		addLine3InBox.sendKeys(taluka);
		addState("Maharashtra");
		addDistrict("Pune");
		pincodeInBox.sendKeys(pin);
	}

	public void addDistrict(String dist) {

		WebDriverWait w = new WebDriverWait(driver, 20);
		distDropDown = w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#detailsDistrict")));
		web.selectValueFromDropDownList(distDropDown, dist);
	}

	public void enterOtherLang(String otherlang) {
		otherLangInBox.sendKeys(otherlang);

	}

	public void addDisabilityType(String type) {
		web.selectValueFromDropDownList(disabilityDropDown, type);
	}

	public void addGender(String value) {
		if (value.equalsIgnoreCase("male"))
			maleRadioBtn.click();
		else if (value.equalsIgnoreCase("female"))
			femaleRadioBtn.click();
		else
			otherRadioBtn.click();
	}

	public void addMaritalStatus(String value) {
		if (value.equalsIgnoreCase("married"))
			marriedRadioBtn.click();
		else if (value.equalsIgnoreCase("unmarried"))
			unmarriedRadioBtn.click();
		else
			other1RadioBtn.click();
	}

	public void addCategory(String value) {
		switch (value) {
		case "SC":
			scRadioBtn.click();
			break;
		case "ST":
			stRadioBtn.click();
			break;
		case "VJA":
			vjaRadioBtn.click();
			break;
		case "NTB":
			ntbRadioBtn.click();
			break;
		case "NTD":
			ntdRadioBtn.click();
			break;
		case "SBC":
			sbcRadioBtn.click();
			break;
		case "OBC":
			obcRadioBtn.click();
		default:
			System.out.println("invalid caste");
		}
	}

	public void nclAvailability(String value) {
		if (value.equalsIgnoreCase("yes"))
			nclYesRadioBtn.click();
		else
			nclNoRadioBtn.click();
	}

	public void nationalityAvailability(String value) {
		if (value.equalsIgnoreCase("yes"))
			NationYesRadioBtn.click();
		else
			NationNoRadioBtn.click();
	}

	public void domicileAvailability(String value) {
		if (value.equalsIgnoreCase("yes"))
			domicileYesRadioBtn.click();
		else
			domicileNoRadioBtn.click();
	}

	public void marathiLangKnownRead() {
		marathiReadCheckBox.click();
	}

	public void marathiLangKnownWrite() {
		marathiWriteCheckBox.click();
	}

	public void marathiLangKnownSpeak() {
		marathiSpeakCheckBox.click();
	}

	public void englishLangKnownRead() {
		englishReadCheckBox.click();
	}

	public void englishLangKnownWrite() {
		englishWriteCheckBox.click();
	}

	public void englishLangKnownSpeak() {
		englishSpeakCheckBox.click();
	}

	public void otherLangKnownRead() {
		otherReadCheckBox.click();
	}

	public void otherLangKnownWrite() {
		otherWriteCheckBox.click();
	}

	public void otherLangKnownSpeak() {
		otherSpeakCheckBox.click();
	}

	public void checkDiasability(String value) {
		if (value.equalsIgnoreCase("yes"))
			DisableYesRadioBtn.click();
		else
			DisableNoRadioBtn.click();
		if (DisableYesRadioBtn.isSelected())
			addDisabilityType("Hearing Impairment");

	}

	public void checkIsFreedomFighterChild(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateFreedomFighterChildYesRadioBtn.click();
		else
			candidateFreedomFighterChildNoRadioBtn.click();
	}

	public void checkProjectAffectedCandidate(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateProjectAffectedYesRadioBtn.click();
		else
			candidateProjectAffectedNoRadioBtn.click();
	}

	public void CheckEarthQuakeAffectedCandidate(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateEarthquakeAffectedYesRadioBtn.click();
		else
			candidateEarthquakeAffectedNoRadioBtn.click();
	}

	public void checkMeritoriousSportPerson(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateMeritoriousSportsYesRadioBtn.click();
		else
			candidateMeritoriousSportsNoRadioBtn.click();
	}

	public void checkDeadInDefenseService(String value) {
		if (value.equalsIgnoreCase("yes"))
			candidateChildWifeServicemanDiedYesRadioBtn.click();
		else
			candidateChildWifeServicemanDiedNoRadioBtn.click();
	}

}
