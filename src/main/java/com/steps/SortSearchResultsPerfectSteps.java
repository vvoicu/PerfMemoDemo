package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.SortSearchResultsPerfectPage;

public class SortSearchResultsPerfectSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 9024471640642890131L;
	SortSearchResultsPerfectPage sortSearchResultsPerfectPage;
	
	@Step
	public void openPage() {
		sortSearchResultsPerfectPage.open();
	}
	
	@Step
	public void sortPricelow() {
		sortSearchResultsPerfectPage.sortPricelow();
	}
	

}
