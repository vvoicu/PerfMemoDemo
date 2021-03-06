package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL + "cremation-urns/pet-urns.html")
public class NavigationPerfectPetPage extends PageObject {

	@FindBy(css = "img[title='Pet Urns TEST']")
	private WebElementFacade petUrns;

	public void clickOnPetUrns() {
		System.out.println("!!!!! pertUrns " + petUrns);
		element(petUrns).waitUntilVisible();
		petUrns.click();
	}

}
