package com.steps.email;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

import org.junit.Assert;

import com.tools.Constants;
import com.tools.abstact.AbstractSteps;

public class EmailClientSteps extends AbstractSteps {

	private static final long serialVersionUID = 1L;
	
	private static String emailContent;
	private static String expectedContent;

	@Step
	public void openMailinator() {
		getDriver().get(Constants.URL_WEB_MAIL);
	}

	@StepGroup
	public String grabEmail(String email, String title) {

		String url = Constants.URL_WEB_MAIL + "inbox.jsp?to=" + email;
		System.out.println("URL : " + url);
		getDriver().get(url);
		grabEmailByTitle(title);
		String welcomeMessage = grabEmailContent();
		return welcomeMessage;
	}

	
	@Step
	public String grabEmailByTitle(String title) {
		return mailinatorPage().grabEmail(title);
	}
	
	@Step
	public String grabEmailContent() {
		return mailinatorMailPage().grabMailContent();
	}

	@StepGroup("Verify Email ")
	public void verifyEmail(String email, String content) {
		emailContent = email;
		expectedContent = content;
		
		expectedContent(content);
		verifyContent();
	}
	
	@Step
	public void expectedContent(String content){
		
	}
	
	@Step
	public void verifyContent(){
		Assert.assertTrue("Failure: Email does not contain expected content.", emailContent.contains(expectedContent));
	}
	
}
