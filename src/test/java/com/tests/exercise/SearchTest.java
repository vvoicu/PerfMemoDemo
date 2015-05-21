package com.tests.exercise;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.SearchSteps;

@RunWith(SerenityRunner.class)

public class SearchTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@ManagedPages(defaultUrl="https://nextv.perfectmemorials.com/")
    public Pages pages;
	
	@Steps
	public SearchSteps searchSteps;

	@Test
	public void make_a_successful_search(){
		searchSteps.is_home_page();
		searchSteps.click_search_input();
		searchSteps.type_a_word("Extra Large Teddy Bear Cremation Urn");
		searchSteps.click_the_search_button();
		searchSteps.verify_if_was_a_successful_search("Category Results");
		searchSteps.click_the_category_urn();
		searchSteps.click_the_teddy_bear_urn();
		searchSteps.verify_if_you_are_on_the_right_page("Large Teddy Bear Cremation Urn - Dark Brown - Personalize");
	}
	
	
	@Test
	public void make_an_unsuccessful_search(){
		searchSteps.click_search_input();
		searchSteps.type_a_word("candy");
		searchSteps.click_the_search_button();
		searchSteps.verify_the_feedback_message("Your search returns no results.");
	}
}
