package Selenium_Locators.Selenium_Locators;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Rahulshettyacademy {
	@Test
	public void GooglePage() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		WebDriver driver =new RemoteWebDriver( new URI("http://192.168.0.149:4444").toURL(),caps);
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
