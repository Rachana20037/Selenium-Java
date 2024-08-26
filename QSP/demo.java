package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.get("file:///E:/Automation/Aman_workspace/youtube.html");
		WebElement element = d.findElement(By.id("youtube"));
		element.click();
		Thread.sleep(5000);
		d.close();
	}

}
