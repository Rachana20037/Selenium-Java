package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification_pop_ups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver d = new ChromeDriver(option);
		d.manage().window().maximize();
		d.get("https://www.yatra.com/");
		Thread.sleep(5000);
		d.close();
		

	}

}
