package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LoginPerfectPage;

public class LoginSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1433700707950737137L;
	private LoginPerfectPage loginPerfectPage;

	@Step
	public void openPage() {
		loginPerfectPage.open();
	}

	@Step
	public void clickTheMyAccountLink() {
		loginPerfectPage.clickMyAccountLink();
	}

	@Step
	public void enterEmail(String keywords) {
		loginPerfectPage.enterEmail(keywords);
	}

	@Step
	public void enterPassword(String keywords) {
		loginPerfectPage.enterPassword(keywords);
	}

	@Step
	public void clickLoginButton() {
		loginPerfectPage.clickLogin();
	}

	@StepGroup
	public void userLoginSteps(String email, String password) {
		clickTheMyAccountLink();
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
	}

}
