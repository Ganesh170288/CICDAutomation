package Selenium_Locators.Selenium_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLoc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	WebElement name=	driver.findElement(By.name("name"));
	System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,5000)");
	WebElement dob=	driver.findElement(By.cssSelector("input[name='bday']"));
	driver.findElement(with(By.xpath("//input[@value='Submit']")).below(dob)).click();
	WebElement checkbox=	driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	driver.findElement(with(By.id("exampleCheck1")).toLeftOf(checkbox)).click();
WebElement radio=	driver.findElement(By.id("inlineRadio1"));
System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());
	
	
		

	}



}
