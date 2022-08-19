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
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//label[@class='note-search']")
	private WebElement txtSearchResult;

	@FindBy(xpath = "//div[10]//div[1]//div[1]//div[1]//div[2]//div[1]//a[1]")
	private WebElement btnWishlist1;
	
	@FindBy(xpath = "//div[11]//div[1]//div[1]//div[1]//div[2]//div[1]//a[1]")
	private WebElement btnWishlist2;
	
	public void search() {
		btnSearch.click();
	}
	public void wishlist1() {
		btnWishlist1.click();
	}
	public void wishlist2() {
		btnWishlist1.click();
	}
	public String getTxtSearchResult() {
		return txtSearchResult.getText();
	}

		
	}
		
		
	
	