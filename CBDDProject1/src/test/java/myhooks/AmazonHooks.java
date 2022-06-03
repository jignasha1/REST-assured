package myhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazonHooks {
	
	@Before(order=1)
	public void setup_app()
	{
		System.out.println("Launch chrome browser");
	}
	
	@Before(order=2)
	public void setup_url()
	{
		System.out.println("Launch Amazon Application");
	}
	@After(order=1)
	public void tearDown_close()
	{
		System.out.println("Close the browser");
	}
	@After(order=2)
	public void tearDown_logout()
	{
		System.out.println("logout from application");
	}
	
	@BeforeStep
	public void takeScreenShot()
	{
		System.out.println("take the screenshot");
	}
	@AfterStep
	public void refreshPage()
	{
		System.out.println("refresh the page");
	}

}
