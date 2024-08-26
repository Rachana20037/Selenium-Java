package testNextGeneration;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A2 {
	@Test(invocationCount = 5, priority = 0, groups="regression")
	public void create() {
		// TODO Auto-generated method stu
		System.out.println("First");
		Reporter.log("Aman",true);
		Reporter.log("bindesh",false);
		Reporter.log("ritik");
	}
	
	@Test (priority = 1, groups = {"smoke","regression"})
	public void  delete() {
		org.testng.Assert.fail();
		System.out.println("second");
		Reporter.log("Aman",true);
		
	}
	
	@Test (priority = 2 , groups="smoke")
	public void aman() {
		System.out.println("Third");
		Reporter.log("Aman",true);
	}

}
