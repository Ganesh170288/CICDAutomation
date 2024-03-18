package Selenium_Locators.Selenium_Locators;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2e {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches",

		     Arrays.asList("disable-popup-blocking"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@value='Mangaluru (IXE)']")).click();
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='DEL']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
if(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]")).getAttribute("style").contains("1"))
{
	System.out.println("It is enabled");
	Assert.assertTrue(true);
}
else
{
	System.out.println("It is not Enabled");
	//Assert.assertTrue(false);
}

driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
Thread.sleep(2000);
System.out.println(driver.findElement(By.xpath("//div[text()='1 Adult']")).getText());
driver.findElement(By.xpath("//div[text()='1 Adult']")).click();

for(int i=0;i<5;i++)
{
	driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	Thread.sleep(2000);
}
driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
Thread.sleep(2000);
System.out.println(driver.findElement(By.xpath("//div[text()='6 Adults']")).getText());
Assert.assertEquals(driver.findElement(By.xpath("//div[text()='6 Adults']")).getText(), "6 Adults");

driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

	}

}
