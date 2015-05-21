package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL + "cremation-urns/pet-urns/metal-pet-urns/paw-print-cremation-urns.html")
public class NavigationPerfectProductDetailPage extends PageObject {

	@FindBy(css = "img[alt='Large Paw Print Cremation Urn ']")
	private WebElementFacade productDetail;

	public void selectProduct() {
		element(productDetail).waitUntilVisible();
		productDetail.click();
	}
}
