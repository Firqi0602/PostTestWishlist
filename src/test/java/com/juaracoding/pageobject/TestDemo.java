package com.juaracoding.pageobject;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.LoginPage;
import com.juaracoding.pageobject.pages.Searchpage;

	@Test
	public class TestDemo {

		public static WebDriver driver;
		private LoginPage loginPage;

		@BeforeClass
		public void setUp() {
			DriverSingleton.getInstance("Firefox");
			WebDriver driver = DriverSingleton.getDriver();
			String url = "https://shop.demoqa.com/my-account/";
			driver.get(url);
		}

		@BeforeMethod
		public void pageObject() {
			loginPage = new LoginPage();
		}

		@Test
		public void TestLogin() {
			loginPage.login("nandiardana60", "Sandipaypal177199");
		}
		@Test
		public void cariWishlist1() {
			scroll(-400);
			delay(5);
			Searchpage.SearchItem("Tokyo Talkies");
			scroll(600);
			Searchpage.wishlist();
			delay(2);
			
		}
		
		@Test
		public void cariWishlist2() {
			scroll(700);
			delay(5);
			Searchpage.SearchItem("white Lace");
			scroll(350);
			Searchpage.wishlist();
			delay(2);
			
			
		}


		private void scroll(int i) {
			// TODO Auto-generated method stub
			
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


