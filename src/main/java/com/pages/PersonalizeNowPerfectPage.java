package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL + "cremation-urns/clearance-specials/biodegradable-eco-urn-engravable.html")
public class PersonalizeNowPerfectPage extends PageObject {

	@FindBy(css = "a[title = 'Personalize Now']")
	private WebElementFacade personalizeNow;

	public void personalizeProductNow() {
		element(personalizeNow).waitUntilVisible();
		personalizeNow.click();
	}

}
