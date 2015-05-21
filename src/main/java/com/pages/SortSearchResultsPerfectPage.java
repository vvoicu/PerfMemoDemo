package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL)
public class SortSearchResultsPerfectPage extends PageObject {

	@FindBy(css = "div.styled-select-medium")
	private WebElementFacade defaultSort;

	@FindBy(css = "option[value='pricelow']")
	private WebElementFacade priceLow;

	public void clickDefaulSort() {
		element(defaultSort).waitUntilVisible();
		defaultSort.click();
	}

	public void sortPricelow() {
		element(priceLow).waitUntilVisible();
		priceLow.click();
	}

}