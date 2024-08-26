package QSP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		
		WebElement src1 = d.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement src2 = d.findElement(By.xpath("//div[.='Mobile Cover']"));
		WebElement src3 = d.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement src4 = d.findElement(By.xpath("//div[.='Laptop Cover']"));
		
		WebElement dest1 = d.findElement(By.xpath("(//div[.='Mobile Accessories'])[1]"));
		WebElement dest2 = d.findElement(By.xpath("(//div[.='Laptop Accessories'])[1]"));
		
		Actions a = new Actions(d);
		
		Thread.sleep(5000);
		a.dragAndDrop(src1, dest1).perform();
		a.dragAndDrop(src2, dest1).perform();
		a.dragAndDrop(src3, dest2).perform();
		a.dragAndDrop(src4, dest2).perform();
		Thread.sleep(5000);
		d.close();

	}

}
