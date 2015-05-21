package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL + "cremation-urns/pet-urns.html")
public class NavigationPerfectMetalPetUrnsPage extends PageObject {

	@FindBy(css = "img[title='Metal Pet Urns']")
	private WebElementFacade metalPetUrns;

	public void clickOnMetalPetUrns() {
		element(metalPetUrns).waitUntilVisible();
		metalPetUrns.click();
	}

}
