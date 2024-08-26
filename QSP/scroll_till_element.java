package QSP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_till_element {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.bbc.com");
		
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) d;
		//j.executeScript("window.scrollBy(0,2000)");
		
		int y = d.findElement(By.xpath("//h2[.='Video']")).getLocation().getY();
		j.executeScript("window.scrollBy(0,"+ y +")");
		
		Thread.sleep(2000);
		d.close();

	}

}
