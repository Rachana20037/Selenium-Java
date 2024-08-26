package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart_Xpath_text {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.navigate().to("https://www.flipkart.com/");
//		
//		d.findElement(By.name("q")).sendKeys("iphone 15");
//		d.findElement(By.cssSelector("button[title ='Search for Products, Brands and More']")).click();
//		Thread.sleep(2000);
//		WebElement s = d.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']"));
//		System.out.println(s.getText());
//		Thread.sleep(1000);
//		s.click();
//		d.quit();
//			
//	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.flipkart.com/");
		
		d.findElement(By.name("q")).sendKeys("HP laptop");
		d.findElement(By.cssSelector("button[title ='Search for Products, Brands and More']")).click();
		Thread.sleep(2000);
		WebElement s = d.findElement(By.xpath("//div[contains(text(),'HP AMD Ryzen 3')]"));
		System.out.println(s.getText());
		Thread.sleep(1000);
		d.quit();
			
	}

}
