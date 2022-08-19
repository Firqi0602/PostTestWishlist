package com.juaracoding.pageobject.drivers.startegies;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.juaracoding.pageobject.drivers.startegies.DriverStrategy;
public class Firefox implements DriverStrategy {

	public WebDriver setStrategy () {
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	return driver;
	}

}
