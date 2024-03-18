package Selenium_Locators.Selenium_Locators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Miscellanious {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=	ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\ganes\\OneDrive\\Desktop\\screenshot.png"));
	}

}
