package com.qa.testcases.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleWindowsDemo {
	WebDriver driver;
	
	@FindBy(linkText="Create an account")
	WebElement CreateAccountUrl;
	public WebElement getCreateAccountUrl()
	{ 
		return CreateAccountUrl;
		
	}
	
	@FindBy(linkText="Terms")
	WebElement TermsLink;
	public WebElement getTermsLink()
	{
		return TermsLink;
	}

	@FindBy(linkText="Privacy")
	WebElement PrivacyLink;
	public WebElement getPrivacyLink()
	{ 
		return PrivacyLink;
	}

	public MultipleWindowsDemo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
