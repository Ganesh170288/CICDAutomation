package Selenium_Locators.Selenium_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSL_Check {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
options.setAcceptInsecureCerts(true);	
WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("Sessionkey");
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		

	}

}
