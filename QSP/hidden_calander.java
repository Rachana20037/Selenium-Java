package QSP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hidden_calander {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		d.findElement(By.id("policynumber")).sendKeys("77889955");
		
		
		d.findElement(By.id("dob")).click();
		WebElement month = d.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select m = new Select(month);
		Thread.sleep(2000);
		m.selectByIndex(7);
		
		WebElement year = d.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select y = new Select(year);
		Thread.sleep(2000);
		y.selectByValue("2024");
		
		d.findElement(By.linkText("18")).click();
		
		d.findElement(By.id("alternative_number")).sendKeys("9988776655");
		
		
//		d.findElement(By.xpath("//button[.='Confirm Box']")).click();
		
//		d.close();


	}

}
