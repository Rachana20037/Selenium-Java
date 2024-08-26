package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class product_price {

	public static void main(String[] args) throws InterruptedException {
		// Printing Product Name -----> Price
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.flipkart.com/");
		d.findElement(By.name("q")).sendKeys("iphone 15");
		d.findElement(By.cssSelector("button[title ='Search for Products, Brands and More']")).click();
		Thread.sleep(2000);
		String product = d.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).getText();
		String price = d.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../../../div[3]/div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(product+" ------> "+price);

	}

}
