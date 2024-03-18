package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test(enabled=false)
	public void Demo()
	{
		System.out.println("Hi");
	}
	@AfterClass
	public void postRequisite()
	{
		System.out.println("I will execute Last");
	}
	@Test(groups = {"Smoke"})
	public void SecondTest()
	{
		System.out.println("Bye");
	}

}
