package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL)
public class NavigationPerfectMenuPage extends PageObject {

	@FindBy(css = "div#pronav-container ul#pronav li#cremation-urns a")
	private WebElementFacade cremation;

	public void clickOnCremation() {
		element(cremation).waitUntilVisible();
		cremation.click();
	}
}
