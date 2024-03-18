package Selenium_Locators.Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_Alerts {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
driver.findElement(By.id("name")).sendKeys("Ganesh");
driver.findElement(By.id("alertbtn")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
Thread.sleep(2000);
driver.findElement(By.id("name")).sendKeys("Ganesh");
driver.findElement(By.id("confirmbtn")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss();







	}

}
