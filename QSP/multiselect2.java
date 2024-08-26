package QSP;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect2{
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	Thread.sleep(5000);
	d.findElement(By.linkText("Multi Select")).click();
	Thread.sleep(2000);
	WebElement countries = d.findElement(By.id("select-multiple-native"));
	
	Select s = new Select(countries);
	
	Thread.sleep(2000);
	s.selectByIndex(6);
	
	Thread.sleep(2000);
	s.selectByValue("Germany");
	
	Thread.sleep(2000);
	s.selectByVisibleText("Poland");
	Thread.sleep(2000);
	
//	s.deselectByIndex(6);
//	s.deselectByValue("Germany");
//	s.deselectByVisibleText("Poland");
	
	String first = s.getFirstSelectedOption().getText();
	
//	List<WebElement> all = s.getAllSelectedOptions();
//	System.out.println(first);
//	int count = all.size();
//	for (int i = 0; i < count; i++) {
//		String op = all.get(i).getText();
//		System.out.println(op);
//	}
//	s.deselectAll();
	
	
	
	
	List<WebElement> all = s.getOptions();
//	int count = all.size();
//	for (int i = 0; i < count; i++) {
//		String op = all.get(i).getText();
//		System.out.println(op);
//	}
	String output = s.getWrappedElement().getText();
	System.out.println(output);
	Thread.sleep(4000);
	d.close();
		
	}

}
