package Selenium_Locators.Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//sibling(parent-(child to child is called sibling )
	String text=	driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
	System.out.println(text);
	//child to parent transverse
	String text1=	driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText();
	System.out.println(text1);

	
	
	

	}

}
