package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.*;

public class NavigationPerfectMetalPetUrnsSteps extends ScenarioSteps {

	private static final long serialVersionUID = 5546802519042221651L;
	private NavigationPerfectMetalPetUrnsPage navigationPerfectMetalPetUrns;

	@Step
	public void selectMetalPetUrns() {
		navigationPerfectMetalPetUrns.clickOnMetalPetUrns();
	}

}
