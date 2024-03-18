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

public class Grid_Google {
	@Test
	public void GooglePage() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.149:4444").toURL(), caps);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("RahulShettyAcademy");
		
		
	}

}
