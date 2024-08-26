package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		//ref.navigate().to("file:///E:/Automation/Aman_workspace/youtube.html");
		//ref.findElement(By.tagName("a")).click();
		ref.navigate().to("https://www.flipkart.com/");
		//ref.findElement(By.partialLinkText("account")).click();
		Thread.sleep(3000);
		ref.findElement(By.name("q")).sendKeys("iphone 15");
		ref.findElement(By.cssSelector("button[title ='Search for Products, Brands and More']")).click();
		Thread.sleep(2000);
		ref.close();
		
	}

}
