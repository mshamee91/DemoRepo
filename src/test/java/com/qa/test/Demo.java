package com.qa.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@BeforeMethod
	public void test1() throws MalformedURLException {
		System.out.println("Test1");

		/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();*/		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(dc);
		
		String hubURL = "http://192.168.43.139:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(hubURL), options);
				
	}

	@Test
	public void display() {
		driver.get("https://www.google.com");
		System.out.println("TESTER");
		System.out.println("SHAMEER");
		System.out.println("GIT");
		System.out.println("DOT");
	}

	@AfterMethod
	public void test2() {
		System.out.println("Test2");
	}
}
