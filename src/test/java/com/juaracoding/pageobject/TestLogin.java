package com.juaracoding.pageobject;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.LoginPage;

@Test
public class TestLogin {

	

	public static WebDriver driver;
	private LoginPage loginPage;

	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Firefox");
		WebDriver driver = DriverSingleton.getDriver();
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		loginPage = new LoginPage();
	}

	@Test
	public void TestInvalidLogin() {
		loginPage.login("Admin", "admin1234");
		assertEquals(loginPage.msgInvalid(), "Invalid Credentials");
	}

	@Test
	public void TestValidLogin() {
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtDashboard(),"Dashboard");
	}

	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
