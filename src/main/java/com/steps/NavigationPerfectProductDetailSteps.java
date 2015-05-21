package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.*;

public class NavigationPerfectProductDetailSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = -7767835156692988417L;
	NavigationPerfectProductDetailPage navigationProductDetail;
	
	@Step
	public void clickOnProductDetail() {
		navigationProductDetail.selectProduct();
	}
	
	

}
