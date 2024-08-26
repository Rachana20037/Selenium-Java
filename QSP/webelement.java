package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.facebook.com/");
//		d.navigate().to("https://www.instagram.com/");
		
		//clear() method
//		d.findElement(By.name("email")).sendKeys("Bindesh246@gmail.com");
//		Thread.sleep(1000);
//		d.findElement(By.name("email")).clear();
		
		//getAttribute() method -> to retrive the value by passing the attribute name
		
//		String s= d.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("src");
//		System.out.println("image src value = "+s);
			
//		String insta= d.findElement(By.xpath("//i[@aria-label='Instagram']")).getAttribute("style.url");
//		System.out.println("image src URL = "+ insta);
		
		//gettagname()  method
		String tag = d.findElement(By.name("login")).getTagName();
		System.out.println("tagname of login = "+tag);
		
		//getsize() getheight() or getwidth()
		int height = d.findElement(By.name("login")).getSize().getHeight();
		System.out.println("Height of login button = "+ height);
		int width = d.findElement(By.name("login")).getSize().getWidth();
		System.out.println("Width of login button = "+ width);
		
	}

}
