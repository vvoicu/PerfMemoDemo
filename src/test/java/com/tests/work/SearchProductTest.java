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

import com.steps.navigation.NavigationSteps;
import com.steps.search.SearchSteps;
import com.tools.Constants;

@RunWith(SerenityRunner.class)
public class SearchProductTest {

	@Managed(uniqueSession = true)
	public WebDriver webrdiver;

	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;

	@Steps
	public SearchSteps searchStep;
	@Steps
	public NavigationSteps navigationSteps;
	
	public String menuName;
	public String subMenuName;
	public String searchTerm;
	public String colorFilterOption;
	public String productName;
	public String productPrice;
	
	@Before
	public void setUp(){
		menuName = "Comfort";
		subMenuName = "Home & Garden Angels";
		searchTerm = "Black & White Flora Keepsake Cremation UrnSale(2) Black & White Flora Keepsake Cremation Urn";
		colorFilterOption = "black";
		productName = "Black Grain Genuine Marble Cremation Urn - Keepsake Size";
		productPrice = "27.75";
	}

	@Test
	public void searchProductTest() {
		navigationSteps.navigateToCategory(menuName, subMenuName);
		searchStep.inputSearchTerm(searchTerm);
		searchStep.applyColorFiler(colorFilterOption);
		searchStep.findProductInSearchList(productName);
		searchStep.verifyProductPrice(productPrice);
	}
}
