package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void WebLoginCarLogin()
	{
		System.out.println("WebLoginCar");
	}
	@Test(timeOut = 4000)
	public void AppiumLoginCarLogin()
	{
		System.out.println("AppiumLoginCar");
	}
	@BeforeClass
	public void preRequiste()
	{
		System.out.println("I will execute first");
	}
	@Test(groups = {"Smoke"})
	public void APILoginCarLogin()
	{
		System.out.println("APILoginCar");
	}
}
