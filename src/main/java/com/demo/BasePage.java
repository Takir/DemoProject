package com.demo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {
	static WebDriver driver;
	public static void verifyUrl() {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "www.facebook.com");
		System.out.println("Url matched");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		verifyUrl();
		System.out.println("Hello Testing ....Hello..Hello");
	}

}
