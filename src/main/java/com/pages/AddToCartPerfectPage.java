package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL + "memorial-jewelry/cremation-jewelry/sterling-silver-box-chain-20.html")
public class AddToCartPerfectPage extends PageObject {

	@FindBy(css = "button[title='Add to Cart']")
	private WebElementFacade addProductToCart;

	public void clickOnAddToCart() {
		element(addProductToCart).waitUntilVisible();
		addProductToCart.click();
	}

}
