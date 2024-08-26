package QSP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		d.findElement(By.xpath("//section[.='Popups']")).click();
		d.findElement(By.xpath("//section[.='Javascript']")).click();
		d.findElement(By.linkText("Confirm")).click();
		d.findElement(By.xpath("//button[.='Confirm Box']")).click();
		 Alert a = d.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		d.close();
		
	}

}
