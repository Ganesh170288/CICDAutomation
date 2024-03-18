package Selenium_Locators.Selenium_Locators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Links {

	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		SoftAssert soft = new SoftAssert();
		List<WebElement> list=driver.findElements(By.xpath("//li/a"));
		int size=list.size();
		System.out.println(size);
		for(WebElement lists:list)
		{


	String link=	lists.getAttribute("href");

		
	//String link=	driver.findElement(By.xpath("//a[@href='https://www.soapui.org/']")).getAttribute("href");
	//System.out.println(link);
HttpURLConnection con = (HttpURLConnection) new URI(link).toURL().openConnection();
con.setRequestMethod("HEAD");
con.connect();
int ResPcode=con.getResponseCode();
System.out.println(ResPcode);
soft.assertTrue(ResPcode<400, "The link with text "+lists.getText()+"is broken with status code: "+ResPcode);


		}
		soft.assertAll();


	}

}
