package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL)
public class SearchPerfectPage extends PageObject {

	@FindBy(name="q")
	private WebElementFacade MySearchInput;
	
	@FindBy(id="myButton")
	private WebElementFacade MySearchButton;
	
	public void enterSearchTerms(String term) {
		element(MySearchInput).waitUntilVisible();
		MySearchInput.type(term);
	}
	
	public void pressSearchButton() {
		element(MySearchButton).waitUntilVisible();
		MySearchButton.click();
	}
}
