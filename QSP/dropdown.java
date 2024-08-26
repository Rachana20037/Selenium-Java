package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		WebElement country = d.findElement(By.xpath("//select[@id='select3']"));
		Select s = new Select(country);
		Thread.sleep(2000);
		s.selectByIndex(7);
		
		WebElement state = d.findElement(By.id("select5"));
		Select s1 = new Select(state);
		Thread.sleep(2000);
		s1.selectByIndex(2);
		
		WebElement city = d.findElement(By.xpath("//select[contains(@class,'border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150')]"));
		Select s2 = new Select(city);
		Thread.sleep(2000);
		s2.selectByIndex(1);
		
	}

}
