package com.qa.testcases.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayDemoPage {
	WebDriver driver;
	@FindBy(linkText ="register")
	WebElement ClickRegisterLink;
	public WebElement getClickRegisterLink() {
		return ClickRegisterLink;
	}
	@FindBy(id="Email")
	WebElement EmailField;
	public WebElement getEmailField() {
		return EmailField;
	}
	public EbayDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
