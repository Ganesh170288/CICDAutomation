package Selenium_Locators.Selenium_Locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
	Set<String> win=	driver.getWindowHandles();
Iterator<String> it=	win.iterator();
String parentid=it.next();
String childid=it.next();
driver.switchTo().window(childid);
System.out.println(driver.findElement(By.xpath("//a[@href='mailto:mentor@rahulshettyacademy.com']")).getText());




	}

}
