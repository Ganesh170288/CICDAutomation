package Selenium_Locators.Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framess {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	System.out.println(driver.findElements(By.tagName("iframe")).size());	
	driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.cssSelector("#draggable")), driver.findElement(By.cssSelector("#droppable"))).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='https://jqueryui.com/accordion/']")).click();
	}

}
