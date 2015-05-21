package com.pages.search;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

import com.tools.abstact.AbstractPage;

public class SearchPage extends AbstractPage {
	
	@FindBy(css = "input#myInput")
	private WebElement searchInput;
	
//	@FindBy(css = "input#myButton")
//	private WebElement searchButton;
	
	public void searchInput(String searchTerm){
		element(searchInput).waitUntilVisible();
		element(searchInput).typeAndEnter(searchTerm);
	}
	
//	public void searchClick(){
//		element(searchButton).waitUntilVisible();
//		searchButton.click();
//	}

}
