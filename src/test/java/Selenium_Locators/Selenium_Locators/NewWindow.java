package Selenium_Locators.Selenium_Locators;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
	Set<String> set=	driver.getWindowHandles();
Iterator<String> it=	set.iterator();
String parentid=it.next();
String childid=it.next();
driver.switchTo().window(childid);
driver.get("https://rahulshettyacademy.com/#/index");
String text=driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p')]")).get(1).getText();
System.out.println(driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p')]")).get(1).getText());
driver.switchTo().window(parentid);
WebElement name=driver.findElement(By.name("name"));
name.sendKeys(text);
File file=name.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("screen.png"));
System.out.println(name.getRect().getDimension().getHeight());
System.out.println(name.getRect().getDimension().getWidth());

	}

}
