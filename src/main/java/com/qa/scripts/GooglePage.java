package com.qa.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement SearchTextField;
	
	public WebElement getSearchTextField() {
		return SearchTextField;
	}
	
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
	WebElement ClickSearchButton;
	
	public WebElement getClickSearchButton() {
		return ClickSearchButton;
	}
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
