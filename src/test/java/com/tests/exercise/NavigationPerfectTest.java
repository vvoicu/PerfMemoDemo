package com.tests.exercise;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.openqa.selenium.WebDriver;

import com.steps.*;
import com.tools.Constants;

@RunWith(SerenityRunner.class)
public class NavigationPerfectTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;

	@Steps
	public NavigationPerfectMenuSteps navigationPerfectMenuSteps;
	@Steps
	public NavigationPerfectPetSteps navigationPerfectPetSteps;
	@Steps
	public NavigationPerfectMetalPetUrnsSteps navigationPerfectMetalPetUrns;
	@Steps
	public NavigationPerfectLoveUrnsSteps navigationPerfectLoveUrns;
	@Steps
	public NavigationPerfectProductDetailSteps navigationProductDetails;

	@Test
	public void navigateToDetails() {
		webdriver.manage().window().maximize();
		navigationPerfectMenuSteps.open_page();
		navigationPerfectMenuSteps.click_on_Cremation();
		navigationPerfectPetSteps.selectPetURns();
		navigationPerfectMetalPetUrns.selectMetalPetUrns();
		navigationPerfectLoveUrns.selectLoveUrnsPets();
		navigationProductDetails.clickOnProductDetail();

	}

}
