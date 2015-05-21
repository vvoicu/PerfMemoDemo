package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.AddToCartPerfectPage;

public class AddToCartPerfectSteps extends ScenarioSteps {

	private static final long serialVersionUID = -5798446220169842556L;
	private AddToCartPerfectPage addToCartPerfectProduct;

	@Step
	public void addProductToCart() {
		addToCartPerfectProduct.clickOnAddToCart();
	}

}
