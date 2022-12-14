package com.juaracoding.pageobject.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class SampleForm {

	private WebDriver driver;

	public SampleForm() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[contains(@for, 'gender-radio')]")
	private List<WebElement> lstGender;

	@FindBy(xpath = "//label[contains(@for, 'hobbies-checkbox')]")
	private List<WebElement> lstHobbies;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")
	private WebElement menuElement;
	
	@FindBy(xpath = "//div[@class='element-list collapse show')]//li[contains(@id,'item')]")
	private List<WebElement> lstMenuElment;

	public void pilihGender(int pilih) {
		lstGender.get(pilih).click();
		System.out.println(lstGender.get(pilih).getText());
	}
	public void pilihHobbies(int pilih) {
		lstGender.get(pilih).click();
		System.out.println(lstHobbies.get(pilih).getText());
	}
	public void pilihMenuElement() {
		menuElement.click();
		lstMenuElment.get(0).click();
		System.out.println(lstMenuElment.get(0).getText());
	}
	
	
	
	
}