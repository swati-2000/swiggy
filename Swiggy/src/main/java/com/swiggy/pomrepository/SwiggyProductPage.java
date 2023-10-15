package com.swiggy.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyProductPage {
	WebDriver driver;

	public SwiggyProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/search']")
	private WebElement searchItemButton;
	
	@FindBy(xpath = "//input[@placeholder='Search for restaurants and food']")
	private WebElement searchItem;
	
	@FindBy(xpath = "//b[text()='Biryani']")
	private WebElement searchInputBox;
	
	@FindBy(xpath = "(//div[text()='By Halli Jonne Biriyani']/../../..//div[text()='ADD'])[1]")
	private WebElement addButton;
	
	@FindBy(xpath = "//button[text()='Item added to cart']")
	private WebElement itemAddedText;
	
	public WebElement getSearchItem() {
		return searchItem;
	}

	@FindBy(xpath = "//div[text()='Checkout']")
	private WebElement checkout;
	
	public WebElement getSearchItemButton() {
		return searchItemButton;
	}

	public WebElement getSearchInputBox() {
		return searchInputBox;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getItemAddedText() {
		return itemAddedText;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getCart() {
		return cart;
	}

	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement cart;

}
