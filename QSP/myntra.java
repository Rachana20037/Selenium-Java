package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.myntra.com/");
		d.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("T-shirt for men");
		d.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		String s = d.findElement(By.xpath("(//h3[text()='Crazymonk'])[1]")).getText();
		System.out.println(s);
		
	}

}
