package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement element1 = d.findElement(By.id("day"));
		Select s = new Select(element1);
		s.selectByIndex(0);
		
		WebElement element2 = d.findElement(By.id("month"));
		Select s1 = new Select(element2);
		s1.selectByIndex(2);		
		
		WebElement element3 = d.findElement(By.id("year"));
		Select s2 = new Select(element3);
		s2.selectByIndex(8);
	}
}
