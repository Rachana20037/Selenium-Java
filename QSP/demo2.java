package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		d.findElement(By.id("email")).sendKeys("bindeshgupta144@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Bindesh2003");
		Thread.sleep(1000);
		d.close();
	}
}
