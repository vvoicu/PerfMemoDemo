package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

import com.tools.abstact.AbstractPage;

public class ProductDetailsPage extends AbstractPage {
	
	@FindBy(css = "span.price")
	private WebElement priceContainer;
	
	public String getProductPrice(){
		element(priceContainer).waitUntilVisible();
		return priceContainer.getText();
	}

}
