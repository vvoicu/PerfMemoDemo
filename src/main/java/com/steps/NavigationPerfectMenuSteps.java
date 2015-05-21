package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.NavigationPerfectMenuPage;

public class NavigationPerfectMenuSteps extends ScenarioSteps {

	private static final long serialVersionUID = 4538433836302763351L;
	private NavigationPerfectMenuPage navigationPerfectMenuPage;

	@Step
	public void open_page() {
		navigationPerfectMenuPage.open();
	}

	@Step
	public void click_on_Cremation() {
		navigationPerfectMenuPage.clickOnCremation();
	}

}
