package com.tests.exercise;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.SearchPerfectStep;
import com.steps.SortSearchResultsPerfectSteps;
import com.tools.Constants;

@RunWith(SerenityRunner.class)
public class SearchPerfectTest {

	@Managed(uniqueSession = true)
	public WebDriver webrdiver;

	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;

	@Steps
	public SearchPerfectStep searchPerfectStep;

	@Steps
	public SortSearchResultsPerfectSteps sortSearchResultPerfectSteps;

	@Test
	public void search() {
		searchPerfectStep.isTheHomepage();
		searchPerfectStep.enterYourSearchTerm("angel on my shoulders");
		searchPerfectStep.pressTheSearchButton();
		sortSearchResultPerfectSteps.sortPricelow();
	}

}
