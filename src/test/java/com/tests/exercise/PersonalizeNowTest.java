package com.tests.exercise;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.PersonalizeNowPerfectSteps;
import com.tools.Constants;

@RunWith(SerenityRunner.class)
public class PersonalizeNowTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.BASE_URL + "cremation-urns/clearance-specials/biodegradable-eco-urn-engravable.html")
	public Pages pages;

	@Steps
	public PersonalizeNowPerfectSteps personalizeNowSteps;

	@Steps
	public LoginSteps loginSteps;

	@Test
	public void addToCartTest() {
		loginSteps.openPage();
		personalizeNowSteps.clickOnPersonalizeNow();
	}

}
