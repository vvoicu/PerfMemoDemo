package com.steps.search;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

import com.tools.abstact.AbstractSteps;

public class SearchSteps extends AbstractSteps{

	private static final long serialVersionUID = 4387138082551124192L;

	
	@Step
	public void inputSearchTerm(String search){
		searchPage().searchInput(search);
	}
	
	@Step
	public void findProductInSearchList(String search){
		searchListPage().searchAndSelect(search);
	}
	
	/**
	 * Select color from filers on left side, form search results.
	 * @param color
	 */
	@Step
	public void applyColorFiler(String color){
		searchFiltersPage().selectColor(color);
	}

	@Step
	public void verifyProductPrice(String productPrice) {
		String productActualPrice = productDetailsPage().getProductPrice();
		Assert.assertTrue("Failure: price values dont match. Expected: " + productPrice + " Actual: " + productActualPrice, productActualPrice.contains(productPrice));
	}
	
}
