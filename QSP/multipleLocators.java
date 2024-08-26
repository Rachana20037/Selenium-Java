package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleLocators {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.navigate().to("https://www.flipkart.com/");
		d.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		//d.findElement(By.name("q")).sendKeys("iphone 15");
		d.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Qspider");
		Thread.sleep(2000);
		//List<WebElement> list = d.findElements(By.xpath("//li[@class='_3D0G9a']"));
		List<WebElement> list = d.findElements(By.xpath("//li[@role='presentation']"));
		
		int count = list.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String names = list.get(i).getText();
			System.out.println(names);
		}	
		d.close();
	}
}
