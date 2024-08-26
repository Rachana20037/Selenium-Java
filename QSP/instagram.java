package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.instagram.com/");
		Thread.sleep(1000);
		d.findElement(By.name("username")).sendKeys("bindeshgupta144@gmail.com");
		d.findElement(By.name("password")).sendKeys("Bindesh2003");
		Thread.sleep(1000);
		d.close();
	}
}

