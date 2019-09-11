package com.demo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {
	static WebDriver driver;
	public static void verifyUrl() {
		
		
		try {
			String url=driver.getCurrentUrl();
			Assert.assertEquals(url, "www.facebook.com");
			System.out.println("Url matched");
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		verifyUrl();
		System.out.println("Hello Testing ....Hello..Hello");
	}

}
