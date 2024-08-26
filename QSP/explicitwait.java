package QSP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		wait.until(ExpectedConditions.titleIs("DemoApps | Qspiders | Text Box"));
		d.findElement(By.xpath("//section[text()='Dropdown']")).click();
		wait.until(ExpectedConditions.titleContains("Dropdown"));
		Thread.sleep(2000);
		d.close();
	}

}
