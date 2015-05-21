package com.tools.abstact;

import net.thucydides.core.steps.ScenarioSteps;

import com.pages.ProductDetailsPage;
import com.pages.account.AccountDashboardPage;
import com.pages.email.MailinatorMailPage;
import com.pages.email.MailinatorPage;
import com.pages.header.MyAccountPage;
import com.pages.header.NavigationPage;
import com.pages.product.ProductOptionsPage;
import com.pages.search.SearchFiltersPage;
import com.pages.search.SearchListPage;
import com.pages.search.SearchPage;

public class AbstractSteps extends ScenarioSteps {
	private static final long serialVersionUID = 5380823942877210710L;

	public SearchPage searchPage() {
		return getPages().currentPageAt(SearchPage.class);
	}

	public SearchListPage searchListPage() {
		return getPages().currentPageAt(SearchListPage.class);
	}

	public SearchFiltersPage searchFiltersPage() {
		return getPages().currentPageAt(SearchFiltersPage.class);
	}

	public NavigationPage navigationPage() {
		return getPages().currentPageAt(NavigationPage.class);
	}

	public ProductOptionsPage productFontStylePage() {
		return getPages().currentPageAt(ProductOptionsPage.class);
	}

	public ProductOptionsPage firstEngravingLinePage() {
		return getPages().currentPageAt(ProductOptionsPage.class);
	}

	public ProductOptionsPage secondEngravingLinePage() {
		return getPages().currentPageAt(ProductOptionsPage.class);
	}

	public ProductOptionsPage productEngravingExamplePage() {
		return getPages().currentPageAt(ProductOptionsPage.class);
	}

	public MyAccountPage myAccountPage() {
		return getPages().currentPageAt(MyAccountPage.class);
	}
	
	public AccountDashboardPage accountDashboardPage() {
		return getPages().currentPageAt(AccountDashboardPage.class);
	}
	
	public MailinatorPage mailinatorPage() {
		return getPages().currentPageAt(MailinatorPage.class);
	}
	
	public MailinatorMailPage mailinatorMailPage() {
		return getPages().currentPageAt(MailinatorMailPage.class);
	}
	
	public ProductDetailsPage productDetailsPage() {
		return getPages().currentPageAt(ProductDetailsPage.class);
	}

}
