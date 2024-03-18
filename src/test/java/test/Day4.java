package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
@Parameters({"url"})
	@Test(dataProvider = "getData")
	public void WebLoginHomeLogin(String urlname,String us1)
	{
		System.out.println("WebLoginHome");
		System.out.println(urlname);
		System.out.println(us1);
		

	}
@Test
	public void AppiumLoginHomeLogin()
	{
		System.out.println("AppiumLoginHome");
		Assert.assertTrue(false);
	}
@Test(dependsOnMethods =  {"WebLoginHomeLogin","AppiumLoginHomeLogin"})
	public void APILoginHomeLogin()
	{
		System.out.println("APILoginHome");
	}
@DataProvider
public Object[][] getData()
{
	Object[][] obj = {{"Ganesh","Pass1"},{"Radhika","Pass2"},{"Thaswika","Pass3"}};
	return obj;
}
}
