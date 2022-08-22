package com.juaracoding.pageobject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class Searchpage{
	
	private WebDriver driver;

	public Searchpage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private static WebElement btnSearch;
	
	@FindBy(xpath = "//input[@name='s']")
	private static WebElement InputSearch;

	@FindBy(xpath = "//a[normalize-space()='My Wishlist']")
	private static WebElement btnWishList;


	public void login(String username, String password) {
		this.username.sendKeys("nandiardana60");
		this.password.sendKeys("Sandipaypal177199");
		btnLogin.click();}
	
	public static void SearchItem(String Cari) {
		btnSearch.click();
		InputSearch.sendKeys(Cari);
		InputSearch.sendKeys(Keys.ENTER);
	}
	

	public static void wishlist() {
		btnWishList.click();
	}
	
	}
