package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.*;

public class NavigationPerfectLoveUrnsSteps extends ScenarioSteps {

	private static final long serialVersionUID = 3340241730078241838L;
	private NavigationPerfectLoveUrnsPage navigationPerfectLoveUrns;

	@Step
	public void selectLoveUrnsPets() {
		navigationPerfectLoveUrns.clickOnLoveUrnsPets();
	}

}
