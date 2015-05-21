package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.pages.NavigationPerfectPetPage;

public class NavigationPerfectPetSteps extends ScenarioSteps {

	private static final long serialVersionUID = 5118123906175818539L;
	private NavigationPerfectPetPage navigationPerfectPetPage;

	@Step
	public void selectPetURns() {
		navigationPerfectPetPage.clickOnPetUrns();
	}

}