package com.trello.qspiders.endtoend;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.swiggy.genericutility.BaseClass;
import com.swiggy.pomrepository.CheckoutPage;
import com.swiggy.pomrepository.SwiggyLoginPage;
import com.swiggy.pomrepository.SwiggyProductPage;

public class SwiggyOrder extends BaseClass{
	@Test
	public void orderBiryani() throws Throwable {
		webdriverUtils.implicitWait(driver);
		SwiggyLoginPage login=new SwiggyLoginPage(driver);
		login.getSearchLocation().sendKeys("Btm");
		login.getLocationClick().click();
		SwiggyProductPage product=new SwiggyProductPage(driver);
		product.getSearchItemButton().click();
		product.getSearchItem().sendKeys("Biryani");
		product.getSearchInputBox().click();
		product.getAddButton().click();
		product.getCart().click();
		CheckoutPage checkout=new CheckoutPage(driver);
		String checkoutText = checkout.getCheckout().getText();
		Reporter.log(checkoutText); 
	}
}
