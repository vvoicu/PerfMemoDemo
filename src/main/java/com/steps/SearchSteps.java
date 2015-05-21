package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.SearchPage;

public class SearchSteps extends ScenarioSteps {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2737794980723414451L;
	SearchPage searchPage;
	
	@Step
	public void is_home_page(){
		searchPage.open();
		getDriver().manage().window().maximize();
	}
	
	@Step
	public void click_search_input(){
		searchPage.click_the_search_input();
	}

	@Step
	public void type_a_word(String word){
		searchPage.search_a_word(word);		
	}
	
	@Step
	public void click_the_search_button(){
		searchPage.click_search_button();
	}
	
	@Step
	public void verify_if_was_a_successful_search(String message){
		searchPage.check_that_you_made_a_good_search(message);
		
	}
	
	@Step
	public void click_the_category_urn(){
		searchPage.click_the_urn_category();
	}
	
	@Step
	public void click_the_teddy_bear_urn(){
		searchPage.click_the_teddy_urn();
	}
	
	@Step
	public void verify_if_you_are_on_the_right_page(String message){
		searchPage.check_that_you_are_on_the_right_page(message);
	}
	
	@Step
	public void verify_the_feedback_message(String message){
		searchPage.check_the_feedback_message("Your search returns no results.");
	}
}
