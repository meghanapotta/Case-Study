package com.qa.testcases.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ToursDemoPage {
	WebDriver driver;
	@FindBy(name="userName")
	WebElement unamefield;
	 
	public WebElement getunamefield() {
		return unamefield;
	}
	
	@FindBy(name="password")
	WebElement pwdfield;
	 
	public WebElement getpwdfield() {
		return pwdfield;
	}
	
	@FindBy(name="submit")
	WebElement submitbtn;
	 
	public WebElement getsubmitbtn() {
		return submitbtn;
	}
	
	@FindBy(linkText="Flights")
	WebElement flightslink;
	
	public WebElement getflightslink() {
		return flightslink;
	}
	
	@FindBy(name="passCount")
	WebElement passengercount;
	
	public Select getpassengercount() {
		
		Select passenger=new Select(passengercount);
		return passenger;
	}
	
	@FindBy(name="fromPort")
	WebElement departure;
	
	public Select getdeparture() {
		
		Select departurefrom=new Select(departure);
		return departurefrom;
	}
	
	@FindBy(name="fromMonth")
	WebElement departuremonth;
	
	public Select getdeparturemonth() {
		
		Select deptmonth=new Select(departuremonth);
		return deptmonth;
	}
	
	@FindBy(name="fromDay")
	WebElement departurday;
	
	public Select getdepartureday() {
		
		Select deptday=new Select(departurday);
		return deptday;
	}
	
	@FindBy(name="toPort")
	WebElement arrival;
	
	public Select getarrival() {
		
		Select arrive=new Select(arrival);
		return arrive;
	}
	
	@FindBy(name="toMonth")
	WebElement returningmonth;
	
	public Select getreturningmonth() {
		
		Select returnmonth=new Select(returningmonth);
		return returnmonth;
	}
	
	@FindBy(name="toDay")
	WebElement returningday;
	
	public Select getreturningday() {
		
		Select returnday=new Select(returningday);
		return returnday;
	}
	
	@FindBy(name="findFlights")
	WebElement continuebtn;
	
	public WebElement getcontinuebtn() {
		return continuebtn;
	}
	public ToursDemoPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
