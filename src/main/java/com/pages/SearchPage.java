package com.pages;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://nextv.perfectmemorials.com")

public class SearchPage extends PageObject {
	
	@FindBy(id="myInput") 
	private WebElementFacade SearchInput;
	
	@FindBy(id="myButton")
	private WebElementFacade SearchButton;
	
	@FindBy(linkText="Soft Teddy Bear Cremation Urns")
	private WebElementFacade BearUrnsCategory;
	
	@FindBy(css= "img[alt='Large Teddy Bear Cremation Urn - Dark Brown - Personalize'] ")
	private WebElementFacade LargeTeddyBear;
	
	
	public void click_the_search_input(){
		element(SearchInput).waitUntilVisible();
		SearchInput.click();
	}

	public void click_search_button(){
		element(SearchButton).waitUntilVisible();
		SearchButton.click();
	}
	
	public void search_a_word(String word){
		element(SearchInput).waitUntilVisible();
		SearchInput.type(word);
	}
	
	public void check_that_you_made_a_good_search(String message) {
		String elementText = getDriver()
				.findElement(By.cssSelector("h2.search-title")).getText()
				.trim();
		if (!elementText.toLowerCase().contains(message.toLowerCase())) {
			Assert.fail(String.format(
					"Thef containerf does not contain message!", message));
			System.out.println(message);
		}
	}
	
	public void click_the_urn_category(){
		element(BearUrnsCategory).waitUntilVisible();
		BearUrnsCategory.click();
		
	}
	
	public void click_the_teddy_urn(){
		element(LargeTeddyBear).waitUntilVisible();
		LargeTeddyBear.click();
	}
	
	public void check_that_you_are_on_the_right_page(String message) {
		String elementText = getDriver()
				.findElement(By.cssSelector("div.product-name")).getText()
				.trim();
		if (!elementText.toLowerCase().contains(message.toLowerCase())) {
			Assert.fail(String.format(
					"Thef containerf does not contain message!", message));
			System.out.println(message);
		}
	}
	
	public void check_the_feedback_message(String message) {
		String elementText = getDriver()
				.findElement(By.cssSelector("p.f-fix")).getText()
				.trim();
		if (!elementText.toLowerCase().contains(message.toLowerCase())) {
			Assert.fail(String.format(
					"Thef containerf does not contain message!", message));
			System.out.println(message);
		}
	}
	
	
}
