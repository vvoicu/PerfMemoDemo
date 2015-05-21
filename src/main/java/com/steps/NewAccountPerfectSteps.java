package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

import org.junit.Assert;

import com.pages.NewAccountPerfectPage;
import com.tools.abstact.AbstractSteps;

public class NewAccountPerfectSteps extends AbstractSteps {

	private static final long serialVersionUID = 1L;
	NewAccountPerfectPage newAccountPerfectPage;

	@Step
	public void isHomePage() {
		newAccountPerfectPage.open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void clickTheMyAccountLink() {
		newAccountPerfectPage.clickMyAccountLink();
	}

	@Step
	public void clickTheNewAccountButton() {
		newAccountPerfectPage.clickNewAccountButton();
	}

	@Step
	public void enterYourFirstname(String firstname) {
		newAccountPerfectPage.enterFirstname(firstname);
	}

	@Step
	public void enterYourLastname(String lastname) {
		newAccountPerfectPage.enterLastname(lastname);
	}

	@Step
	public void enterYourEmail(String email) {
		newAccountPerfectPage.enterEmail(email);
	}

	@Step
	public void confirmYourEmail(String retypeemail) {
		newAccountPerfectPage.confirmEmail(retypeemail);
	}

	@Step
	public void enterNewPass(String password) {
		newAccountPerfectPage.enterPassword(password);
	}

	@Step
	public void confirmPassword(String retypepass) {
		newAccountPerfectPage.confirmPassword(retypepass);
	}

	public void clickCreateAccountFreeButton() {
		newAccountPerfectPage.clickCreateAccountButton();
	}

	@Step
	public void clickSignOut() {
		newAccountPerfectPage.signOut();
	}

	@StepGroup
	public void enterYourPersonalInformation(String firstname, String lastname,
			String email, String retypeemail) {
		enterYourFirstname(firstname);
		enterYourLastname(lastname);
		enterYourEmail(email);
		confirmYourEmail(retypeemail);
	}

	@StepGroup
	public void enterPassword(String password, String retypePass) {
		enterNewPass(password);
		confirmPassword(retypePass);
	}

	@Step
	public void verifyContactInformation(String userEmail) {
		String actualEmail = accountDashboardPage().getContactInfoEmail();
		Assert.assertTrue("Failure: emails do not match. Expected: '" + userEmail + "'. Actual: '" + actualEmail + "'", actualEmail.contains(userEmail));
	}

}
