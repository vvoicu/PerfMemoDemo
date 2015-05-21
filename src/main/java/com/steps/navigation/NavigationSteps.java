package com.steps.navigation;

import net.thucydides.core.annotations.Step;

import com.tools.abstact.AbstractSteps;

public class NavigationSteps extends AbstractSteps{

	private static final long serialVersionUID = -2276965784713464902L;

	
	@Step
	public void navigateToCategory(String category, String subCategory){
		navigationPage().selectCategory(category);
		System.out.println("------------------------------");
		navigationPage().selectSubCategory(subCategory);
	}
	
}
