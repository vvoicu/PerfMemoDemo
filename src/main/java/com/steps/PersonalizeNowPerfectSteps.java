package com.steps;

import com.pages.PersonalizeNowPerfectPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;



public class PersonalizeNowPerfectSteps extends ScenarioSteps {

	private static final long serialVersionUID = -5105182545577048634L;
	private PersonalizeNowPerfectPage personalizeNow;
	
	@Step
	public void clickOnPersonalizeNow() {
		personalizeNow.personalizeProductNow();
	}

}
