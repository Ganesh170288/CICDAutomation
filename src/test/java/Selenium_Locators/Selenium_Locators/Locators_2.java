package Selenium_Locators.Selenium_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_2 {

	public static void main(String[] args) throws InterruptedException {
		String Expstring="You are successfully logged in.";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("ganesh");
		//name
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		//classname
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		//tagname-Locator
	System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), Expstring);
String text=		driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
Assert.assertEquals(text, "Hello ganesh,");
driver.findElement(By.xpath("//button[text()='Log Out']")).click();
driver.close();
		

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String textt=	driver.findElement(By.cssSelector("form p")).getText();
String arr[]	=textt.split("'");
String passwordtext=arr[1];
String password=passwordtext.split("'")[0];
//String password=arr1[0];
return password;
	}

}

///html/body/header/div/button[2]
