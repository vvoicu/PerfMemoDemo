package com.tests.work;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.navigation.MyAccountSteps;
import com.tools.Constants;
import com.tools.FieldGenerators;
import com.tools.FieldGenerators.Mode;

@RunWith(SerenityRunner.class)
public class EditMyAccountTest {

	@Managed(uniqueSession = true)
	public WebDriver webrdiver;

	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;

	@Steps
	public MyAccountSteps myAccountSteps;
	
	private String userName;
	private String userPass;
	
	private String firstName;
	private String lastName;
	private String companyName;
	private String companyPhone;
	private String companyStreet;
	private String companyCity;
	private String companyPostCode;
	private String companyCityState;

	@Before
	public void setUp(){
		userName = "niny2391@yahoo.com";
		userPass = "testtest";
		
		firstName = FieldGenerators.generateRandomString(9, Mode.ALPHA);
		lastName = FieldGenerators.generateRandomString(7, Mode.ALPHA);
		companyName = "Evozon " + FieldGenerators.generateRandomString(7, Mode.ALPHANUMERIC);
		companyPhone = FieldGenerators.generateRandomString(7, Mode.NUMERIC);
		companyStreet = FieldGenerators.generateRandomString(12, Mode.ALPHANUMERICSCHAR);
		companyCity = FieldGenerators.generateRandomString(8, Mode.ALPHA);
		companyPostCode = FieldGenerators.generateRandomString(6, Mode.NUMERIC);
		companyCityState = "Nova Scotia";
	}
	

	@Test
	public void editMyAccountTest() throws InterruptedException {
		myAccountSteps.isHomePage();
		myAccountSteps.clickTheLoginLink();
		myAccountSteps.enterYourCredentials(userName, userPass);
		myAccountSteps.clickTheLoginButton();
		myAccountSteps.clickAccountInformationLink();
		myAccountSteps.editAccountInformation(firstName, lastName);
		myAccountSteps.saveTheEditedInformation();
		myAccountSteps.clickAddressBookLink();
		myAccountSteps.clickChangeLink();
		myAccountSteps.editAddressBookInformation(companyName, companyPhone, companyStreet, companyCity, companyPostCode);
		myAccountSteps.selectAState(companyCityState);
		myAccountSteps.saveTheEditedInformation();
		myAccountSteps.clickTheMyOrdersLink();
		myAccountSteps.clickBackButton();
		myAccountSteps.clickMyProductReviewsLink();
		myAccountSteps.clickBackButton();
		myAccountSteps.clickNewslettterSubscriptionsLink();
		myAccountSteps.clickGeneralSubscriptionCheckbox();
		myAccountSteps.saveTheEditedInformation();
	}

}
