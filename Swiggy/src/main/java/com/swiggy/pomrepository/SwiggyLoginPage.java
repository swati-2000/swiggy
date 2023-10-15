package com.swiggy.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyLoginPage {
	WebDriver driver;

	public SwiggyLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='location']")
	private WebElement searchLocation;

	@FindBy(xpath = "//span[text()='BTM Layout, Bengaluru, Karnataka, India']")
	private WebElement locationClick;

	public WebElement getSearchLocation() {
		return searchLocation;
	}

	public WebElement getLocationClick() {
		return locationClick;
	}

}
