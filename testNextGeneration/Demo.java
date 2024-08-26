package testNextGeneration;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Demo {
	
	
	@Test(invocationCount = 5, priority = 0, groups="regression")
	public void create() {
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

//Assert.fail();  it is use to fail the test script intentionally
//enabled=false it is use to avoid the execution of test script
//