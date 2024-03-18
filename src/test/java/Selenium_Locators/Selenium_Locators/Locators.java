package Selenium_Locators.Selenium_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//id
		driver.findElement(By.id("inputUsername")).sendKeys("ganesh");
		//name
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy123");
		//classname
		driver.findElement(By.className("signInBtn")).click();
         //Tagname[Attribute='Value']
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//linktext
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		////Tagname[@Attribute='Name']
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ganesh");
////Tagname[@Attribute='Name'][Index]
driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("ganesh.fugenx@gmail.com");

driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8147251123");
//Xpath-//ParentTagname/ChildTagname[Index]
driver.findElement(By.xpath("//form/input[3]")).clear();
//cssselector-Tagname[Attribute='value']:nth-child(Index)
driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("12345678");
//cssselector- .classname
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//cssselector - ParentTagname ChildTagName
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//xpath-//Tagname[@Attribute='Value']/ChildTagName[Index]
driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//cssselector-#id
Thread.sleep(2000);
driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Ganesh");
//cssselector-Regular Expression- TagName[Attribute*='Value']
driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxTwo")).click();
//xpath-Tagname[contains(@Attribute,'Value')]
driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();



	}

}
