package com.ydcc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import sprinT.utilities.WebElementActions;

public class EducationalDetailsPage {
	WebDriver driver;
	WebElementActions act = new WebElementActions();

	public EducationalDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "a[href*='home']")
	WebElement homeButton;

	@FindBy(css = "a[href*='logout']")
	WebElement logoutButton;
	// SSC
	@FindBy(css = "select#sscSpecialization")
	WebElement sscSpecializationDDL;

	@FindBy(css = "select#sscBoard")
	WebElement sscBoardDDL;

	@FindBy(css = "select#sscPassingYear")
	WebElement sscPassingYearDDL;

	@FindBy(css = "input#sscPercent")
	WebElement sscPercentTxtBx;

	@FindBy(css = "select#sscClass")
	WebElement sscClassDDL;
	// HSC
	@FindBy(css = "select#hscSpecialization")
	WebElement hscSpecializationDDL;

	@FindBy(css = "select#hscBoard")
	WebElement hscBoardDDL;

	@FindBy(css = "select#hscyear")
	WebElement hscPassingYearDDL;

	@FindBy(css = "input#hscPercent")
	WebElement hscPercentTxtBx;

	@FindBy(css = "select#hscClass")
	WebElement hscClassDDL;
	// ITI
	@FindBy(css = "select#itiSpecialization")
	WebElement itiSpecializationDDL;

	@FindBy(css = "select#itiBoard")
	WebElement itiBoardDDL;

	@FindBy(css = "select#itiPassingYear")
	WebElement itiPassingYearDDL;

	@FindBy(css = "input#itiPercent")
	WebElement itiPercentTxtBx;

	@FindBy(css = "select#itiClass")
	WebElement itiClassDDL;
	// Diploma Details/ Professional Courses
	@FindBy(css = "select#dSpacialization")
	WebElement diplomaSpecializationDDL;

	@FindBy(css = "select#dBoard")
	WebElement diplomaBoardDDL;

	@FindBy(css = "select#dPassingYear")
	WebElement diplomaPassingYearDDL;

	@FindBy(css = "input#dPercent")
	WebElement diplomaPercentTxtBx;

	@FindBy(css = "select#dClass")
	WebElement diplomaClassDDL;
	// Graduation
	@FindBy(css = "select#gSpacialization")
	WebElement graduationSpecializationDDL;

	@FindBy(css = "select#gBoard")
	WebElement graduationBoardDDL;

	@FindBy(css = "select#gYear")
	WebElement graduationPassingYearDDL;

	@FindBy(css = "input#gPercent")
	WebElement graduationPercentTxtBx;

	@FindBy(css = "select#gClass")
	WebElement graduationClassDDL;

	// Post Graduation
	@FindBy(css = "select#pgSpacialization")
	WebElement postGraduationSpecializationDDL;

	@FindBy(css = "select#pgBoard")
	WebElement postGraduationBoardDDL;

	@FindBy(css = "select#pgYear")
	WebElement postGraduationPassingYearDDL;

	@FindBy(css = "input#pgPercent")
	WebElement postGraduationPercentTxtBx;

	@FindBy(css = "select#pgClass")
	WebElement postGraduationClassDDL;

	// Computer Certificate/ Certificate
	@FindBy(css = "select#ccSpacialization")
	WebElement computerCertificateSpecializationDDL;

	@FindBy(css = "select#ccYear")
	WebElement computerCertificatePassingYearDDL;

	@FindBy(css = "input#ccPercent")
	WebElement computerCertificatePercentTxtBx;

	@FindBy(css = "select#ccClass")
	WebElement computerCertificateClassDDL;

	// Other Qualification
	@FindBy(css = "input#moreInformationSpacialization")
	WebElement otherQualificationSpecializationTxtBx;

	@FindBy(css = "input#moreInformationBoard")
	WebElement otherQualificationBoardTxtBx;

	@FindBy(css = "select#moreInformationYear")
	WebElement otherQualificationPassingYearDDL;

	@FindBy(css = "input#moreInformationPercentage")
	WebElement otherQualificationPercentTxtBx;

	@FindBy(css = "moreInformationClass")
	WebElement otherQualificationClassDDL;

	@FindBy(css = "button#addExtraQualification")
	WebElement addDetailsBtn;

	// Typing Details
	@FindBy(css = "input#ca_mt")
	WebElement marathi30wpmCkBox;

	@FindBy(css = "input#ca_mf")
	WebElement marathi40wpmCkBox;

	@FindBy(css = "input#ca_et")
	WebElement english30wpmCkBox;

	@FindBy(css = "input#ca_ef")
	WebElement english40wpmCkBox;

	@FindBy(css = "input#ca_ht")
	WebElement hindi30wpmCkBox;

	@FindBy(css = "input#ca_hf")
	WebElement hindi40wpmCkBox;

	// Work Experience
	@FindBy(css = "input#expOrgName1")
	WebElement organisationNameTxtBx;

	@FindBy(css = "input#expLocation1")
	WebElement locationTxtBx;

	@FindBy(css = "input#expDesignation1")
	WebElement designationTxtBx;

	@FindBy(css = "input#expServiceYear1")
	WebElement totalServiceYearTxtBx;

	@FindBy(css = "button#expSave")
	WebElement addExpDetailsBtn;

	@FindBy(css = "button#back")
	WebElement backBtn;

	@FindBy(css = "button#verifyEducationalDetails")
	WebElement verifyDetailsBtn;
	
	@FindBy(css = "button.swal2-confirm.swal2-styled")
	WebElement oKBtn;

	// Methods for Education Page

	public void addSSCDetails(String specialization, String board, String passedYear, String percentage,
			String gradeclass) {
		act.selectValueFromDropDownList(sscSpecializationDDL, specialization);
		act.selectValueFromDropDownList(sscBoardDDL, board);
		act.selectValueFromDropDownList(sscPassingYearDDL, passedYear);
		sscPercentTxtBx.sendKeys(percentage);
		act.selectValueFromDropDownList(sscClassDDL, gradeclass);
	}

	public void addHSCDetails(String specialization, String board, String passedYear, String percentage,
			String gradeclass) {
		act.selectValueFromDropDownList(hscSpecializationDDL, specialization);
		act.selectValueFromDropDownList(hscBoardDDL, board);
		act.selectValueFromDropDownList(hscPassingYearDDL, passedYear);
		hscPercentTxtBx.sendKeys(percentage);
		act.selectValueFromDropDownList(hscClassDDL, gradeclass);
	}

	public void addITIDetails(String specialization, String board, String passedYear, String percentage,
			String gradeclass) {
		act.selectValueFromDropDownList(itiSpecializationDDL, specialization);
		act.selectValueFromDropDownList(itiBoardDDL, board);
		act.selectValueFromDropDownList(itiPassingYearDDL, passedYear);
		itiPercentTxtBx.sendKeys(percentage);
		act.selectValueFromDropDownList(itiClassDDL, gradeclass);
	}

	public void addDiplomaDetails(String specialization, String board, String passedYear, String percentage,
			String gradeclass) {
		act.selectValueFromDropDownList(diplomaSpecializationDDL, specialization);
		act.selectValueFromDropDownList(diplomaBoardDDL, board);
		act.selectValueFromDropDownList(diplomaPassingYearDDL, passedYear);
		diplomaPercentTxtBx.sendKeys(percentage);
		act.selectValueFromDropDownList(diplomaClassDDL, gradeclass);
	}

	public void addGradutionDetails(String specialization, String board, String passedYear, String percentage,
			String gradeclass) {
		act.selectValueFromDropDownList(graduationSpecializationDDL, specialization);
		act.selectValueFromDropDownList(graduationBoardDDL, board);
		act.selectValueFromDropDownList(graduationPassingYearDDL, passedYear);
		graduationPercentTxtBx.sendKeys(percentage);
		act.selectValueFromDropDownList(graduationClassDDL, gradeclass);
	}

	public void addPostGradutionDetails(String specialization, String board, String passedYear, String percentage,
			String gradeclass) {
		act.selectValueFromDropDownList(postGraduationSpecializationDDL, specialization);
		act.selectValueFromDropDownList(postGraduationBoardDDL, board);
		act.selectValueFromDropDownList(postGraduationPassingYearDDL, passedYear);
		postGraduationPercentTxtBx.sendKeys(percentage);
		act.selectValueFromDropDownList(postGraduationClassDDL, gradeclass);
	}

	public void addComputerCertificateDetails(String specialization, String passedYear, String percentage,
			String gradeclass) {
		act.selectValueFromDropDownList(computerCertificateSpecializationDDL, specialization);
		act.selectValueFromDropDownList(computerCertificatePassingYearDDL, passedYear);
		computerCertificatePercentTxtBx.sendKeys(percentage);
		act.selectValueFromDropDownList(computerCertificateClassDDL, gradeclass);
	}

	public void addOtherQualificationDetails(String specialization, String board, String passedYear, String percentage,
			String gradeclass) {
		postGraduationSpecializationDDL.sendKeys(specialization);
		postGraduationBoardDDL.sendKeys(board);
		act.selectValueFromDropDownList(postGraduationPassingYearDDL, passedYear);
		postGraduationPercentTxtBx.sendKeys(percentage);
		act.selectValueFromDropDownList(postGraduationClassDDL, gradeclass);
		addDetailsBtn.click();

	}

	public void addMarathi30wpmTypingDetails() {
		marathi30wpmCkBox.click();
	}

	public void addMarathi40wpmTypingDetails() {
		marathi40wpmCkBox.click();
	}

	public void addEnglish30wpmTypingDetails() {
		english30wpmCkBox.click();
	}

	public void addEnglish40wpmTypingDetails() {
		english40wpmCkBox.click();
	}

	public void addHindi30wpmTypingDetails() {
		hindi30wpmCkBox.click();
	}

	public void addHindi40wpmTypingDetails() {
		hindi40wpmCkBox.click();
	}

	public void addWorkExperience(String organisationName, String location, String designation,
			String totalServiceYear) {
		organisationNameTxtBx.sendKeys(organisationName);
		locationTxtBx.sendKeys(location);
		designationTxtBx.sendKeys(designation);
		totalServiceYearTxtBx.sendKeys(totalServiceYear);
		addDetailsBtn.click();
	}

	public void clickOnVerifyDetailsBtn() {
		addDetailsBtn.click();
	}

	public void clickOnBackBtn() {
		backBtn.click();
	}
	
	public void clickOnOKBtn() {
		oKBtn.click();
	}
}
