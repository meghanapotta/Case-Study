package com.qa.testcases.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayDemoPage {
	WebDriver driver;
	@FindBy(linkText="register")
	WebElement RegistrationLink;
	
	public WebElement getRegistrationLink() {
		return RegistrationLink;
	}
	
	//Enter first name and last name,email password of the text field
	@FindBy(id="firstname")
	WebElement FirstName;
	public WebElement getFirstName() {
		return FirstName;
	}
	
	@FindBy(id="lastname")
	WebElement LastName;
	public WebElement getLastName() {
		return LastName;
	}
	
	@FindBy(id="Email")
	WebElement EmailField;
	public WebElement getEmailField() {
		return EmailField;
	}
	
	@FindBy(id="password")
	WebElement PasswordField;
	public WebElement getPasswordField() {
		return PasswordField;
	}
	
	@FindBy(id="showpassword")
	WebElement ShowPassword;
	public WebElement getShowPassword() {
		return ShowPassword;
	}
	
	@FindBy(id="EMAIL_REG_FORM_SUBMIT")
	WebElement ClickRegisterButton;
	public WebElement getClickRegisterButton() {
		return ClickRegisterButton;
	}
	
	public EbayDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
