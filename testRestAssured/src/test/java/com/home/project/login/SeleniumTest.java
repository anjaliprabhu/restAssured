package com.home.project.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	private WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "/Users/prabhu/Downloads/geckodriver");
		driver = new FirefoxDriver();
	}

	@Test
	public void testEasy() {
		driver.get("https://www.syde.com");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Anjali"));
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
