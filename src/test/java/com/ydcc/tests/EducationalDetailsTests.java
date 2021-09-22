package com.ydcc.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ydcc.pages.EducationalDetailsPage;

import configuration.BaseFramework;
import sprinT.utilities.WebElementActions;

public class EducationalDetailsTests extends BaseFramework {

	@Test
	public void addEducationDetails() {
		EducationalDetailsPage educationalDetails = PageFactory.initElements(WebElementActions.driver,EducationalDetailsPage.class);
		educationalDetails.addSSCDetails("SSC/10th", "State Board", "2010", "80", "Distinction");
		educationalDetails.addHSCDetails("HSC/12th", "State Board", "2012", "70", "First Class");
		educationalDetails.addGradutionDetails("BCS","Tata Institute of Fundamental Research, Homi Bhabha Road, Mumbai", "2017", "75", "First Class");
	}
	
	@Test
	public void addTypingDetails() {
		EducationalDetailsPage educationalDetails = PageFactory.initElements(WebElementActions.driver,EducationalDetailsPage.class);
		educationalDetails.addMarathi30wpmTypingDetails();
		educationalDetails.addEnglish40wpmTypingDetails();
	}
	
	@Test
	public void addWorkExperience() {
		EducationalDetailsPage educationalDetails = PageFactory.initElements(WebElementActions.driver,EducationalDetailsPage.class);
		educationalDetails.addWorkExperience("XYZ", "Mumbai", "MNOP", "2");
	}
	
	@Test
	public void clickOnVaeifyBtn() throws InterruptedException {
		EducationalDetailsPage educationalDetails = PageFactory.initElements(WebElementActions.driver,EducationalDetailsPage.class);
		educationalDetails.clickOnVerifyDetailsBtn();
	}
	
	@Test
	public void clickOnOKBtn() throws InterruptedException {
		EducationalDetailsPage educationalDetails = PageFactory.initElements(WebElementActions.driver,EducationalDetailsPage.class);
		educationalDetails.clickOnOKBtn();
	}
	
	@Test
	public void clickOnBackBtn() {
		EducationalDetailsPage educationalDetails = PageFactory.initElements(WebElementActions.driver,EducationalDetailsPage.class);
		educationalDetails.clickOnBackBtn();
	}
	
	

}
