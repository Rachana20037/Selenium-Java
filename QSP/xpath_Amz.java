package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Amz {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.amazon.in/");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15");
		Thread.sleep(3000);
		d.findElement(By.id("//input[@id='nav-search-submit-button']")).click();
		
	}

}
