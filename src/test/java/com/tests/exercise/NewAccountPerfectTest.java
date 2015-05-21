package com.tests.exercise;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.NewAccountPerfectSteps;

@RunWith(SerenityRunner.class)
public class NewAccountPerfectTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@ManagedPages(defaultUrl = "https://nextv.perfectmemorials.com/")
	public Pages pages;

	@Steps
	public NewAccountPerfectSteps newAccountPerfectSteps;

	@Test
	public void makeANewAccount() throws InterruptedException {
		newAccountPerfectSteps.isHomePage();
		newAccountPerfectSteps.clickTheMyAccountLink();
		newAccountPerfectSteps.clickTheNewAccountButton();
		newAccountPerfectSteps.enterYourFirstname("Ana");
		newAccountPerfectSteps.enterYourLastname("Maria");
		newAccountPerfectSteps.enterYourEmail("aaaa@yahoo.com");
		newAccountPerfectSteps.confirmYourEmail("aaaa@yahoo.com");
		newAccountPerfectSteps.enterNewPass("ana2323");
		newAccountPerfectSteps.confirmPassword("ana2323");
		newAccountPerfectSteps.clickCreateAccountFreeButton();
		// newAccountPerfectSteps.checkSuccesfullMessage("Welcome,Ana Maria!");
	}

//	@Test
//	public void createNewAccount() {
//		newAccountPerfectSteps.clickSignOut();
//		newAccountPerfectSteps.isHomePage();
//		newAccountPerfectSteps.clickTheMyAccountLink();
//		newAccountPerfectSteps.clickTheNewAccountButton();
//		newAccountPerfectSteps.enterYourPersonalInformation("Alina", "SSS",
//				"ali@a.com", "ali@a.com");
//		newAccountPerfectSteps.enterPassword("ana2323",
//				"ana2323");
//		newAccountPerfectSteps.clickCreateAccountFreeButton();
//
//	}

}
