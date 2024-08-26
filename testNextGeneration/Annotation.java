package testNextGeneration;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@AfterSuite
	public void databasedicconnect() {
		Reporter.log("Database disconnect Succesfully");
	}
	
	@BeforeTest
	public void LaunchBrowser() {
		Reporter.log("Browser Launch Successfully");
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("logged in Succesfully");
	}
	
	@Test
	public void createcustomer()
	{
		Reporter.log("Customer Created Succesfully");
	}
	
	@AfterMethod
	public void  logout()
	{
		Reporter.log("Logout Done Successfully");
	}
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Browser  is Closed Successfully");
	}
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("Database connected Successfully");
	}
	
}
