package com.steps;

import com.pages.SearchPerfectPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class SearchPerfectStep extends ScenarioSteps {

	private static final long serialVersionUID = 4218918695355314075L;
	SearchPerfectPage searchPerfectPage;
	
	@Step
    public void isTheHomepage() {
		searchPerfectPage.open();
	}
	
	@Step
	public void enterYourSearchTerm(String keywords) {
		searchPerfectPage.enterSearchTerms(keywords);
		
	}
	
	@Step 
	public void pressTheSearchButton() {
		searchPerfectPage.pressSearchButton();
	}
	
	

}
