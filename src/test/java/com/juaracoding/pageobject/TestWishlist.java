package com.juaracoding.pageobject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.Wishlist;


	public class TestWishlist {
		public static WebDriver driver;
		private Wishlist wishlist;

		@BeforeClass
		public void setUp() {
			DriverSingleton.getInstance("Firefox");
			driver = DriverSingleton.getDriver();
			String url = "https://shop.demoqa.com/";
			driver.get(url);
		}

		@BeforeMethod
		public void pageObject() {
			wishlist = new Wishlist();
		}

		@Test
		public void testSearch() {
			wishlist.search();
			delay(1);
			
		}
		@Test
		public void TestSearch() {
			wishlist.search("Dress\n");
		
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

