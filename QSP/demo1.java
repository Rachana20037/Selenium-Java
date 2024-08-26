package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("file:///E:/Automation/Aman_workspace/youtube.html");
		WebElement element = d.findElement(By.id("youtube"));	
		element.click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(1500);
		WebElement element1 = d.findElement(By.id("facebook"));	
//		element1.click();
		Thread.sleep(1500);
		d.navigate().back();
		d.navigate().forward();
		Thread.sleep(5000);
		d.navigate().refresh();
		Thread.sleep(5000);
		d.close();
		
	}
}
