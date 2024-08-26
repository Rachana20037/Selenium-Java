package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		//ref.navigate().to("file:///E:/Automation/Aman_workspace/youtube.html");
		//ref.findElement(By.tagName("a")).click();
		ref.navigate().to("https://www.facebook.com/");
		ref.findElement(By.partialLinkText("account")).click();
		Thread.sleep(2000);
		ref.findElement(By.name("firstname")).sendKeys("Bindesh");
		ref.findElement(By.name("lastname")).sendKeys("Gupta");
		ref.findElement(By.name("reg_email__")).sendKeys("9082596783");
		ref.findElement(By.name("reg_passwd__")).sendKeys("Bindesh2003@@");
		//ref.findElement(By.name("birthday_day")).
		Thread.sleep(5000);
		ref.close();
	
	}

}
