package com.tests.exercise;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.AddToCartPerfectSteps;
import com.steps.LoginSteps;
import com.tools.Constants;

@RunWith(SerenityRunner.class)

public class AddToCartPerfectTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@ManagedPages(defaultUrl= Constants.BASE_URL + "memorial-jewelry/cremation-jewelry/sterling-silver-box-chain-20.html")
    public Pages pages;
	
	@Steps
	public AddToCartPerfectSteps addToCartPerfectSteps;
	
	@Steps
	public LoginSteps loginSteps;
	
	@Test
	public void addToCartTest() {
		loginSteps.openPage();
		addToCartPerfectSteps.addProductToCart();
	}

}
