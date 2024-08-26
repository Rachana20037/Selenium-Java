package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_multi {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	Thread.sleep(5000);
	d.findElement(By.linkText("Multi Select")).click();
	WebElement countries = d.findElement(By.id("select-multiple-native"));
	Thread.sleep(2000);
	Select s = new Select(countries);
	s.selectByVisibleText("Canada");
	Thread.sleep(1000);
	s.selectByVisibleText("Germany");
	Thread.sleep(1000);
	s.selectByVisibleText("Poland");
	Thread.sleep(1000);
	d.close();
		
	}

}
