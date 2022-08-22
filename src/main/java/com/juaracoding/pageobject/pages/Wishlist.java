package com.juaracoding.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class Wishlist {
private WebDriver driver;
	
	public Wishlist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpa)
	
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;
	

	public void search() {
		btnSearch.click();
		this.btnSearch.sendKeys("Dress\n");
	}

		
	}
		
		
	
	