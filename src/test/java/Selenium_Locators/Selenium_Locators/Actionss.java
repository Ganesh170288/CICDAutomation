package Selenium_Locators.Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionss {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		WebElement move= driver.findElement(By.cssSelector("#nav-link-accountList"));
		WebElement move1 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		act.moveToElement(move1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		act.moveToElement(move).contextClick().build().perform();


	}

}
