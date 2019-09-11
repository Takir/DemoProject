package com.demo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {
	WebDriver driver;
	public void verifyUrl() {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "www.facebook.com");
		System.out.println("Url matched");
	}

}
