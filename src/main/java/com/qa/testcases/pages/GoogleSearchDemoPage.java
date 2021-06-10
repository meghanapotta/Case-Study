package com.qa.testcases.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchDemoPage {
	WebDriver driver;
	
	@FindBy(name="q")

	WebElement SearchTextField;
	
	public WebElement getSearchTextField() {
		return SearchTextField;
	}
	
	@FindBy(name="btnK")
	WebElement ClickSearchButton;
	
	public WebElement getClickSearchButton() {
		return ClickSearchButton;
	}
	
	public GoogleSearchDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
