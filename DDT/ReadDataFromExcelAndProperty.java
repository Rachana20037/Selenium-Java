package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcelAndProperty {

	public static void main(String[] args) throws IOException {
	
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	FileInputStream fis = new FileInputStream("./TestData/commondata1.property");
	Properties p = new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	d.get(URL);
	String UN = p.getProperty("un");
	d.findElement(By.id("username")).sendKeys(UN);
	String PWD = p.getProperty("pwd");
	d.findElement(By.name("pwd")).sendKeys(PWD);
	d.findElement(By.id("loginButton")).click();
	
	
	
	
	
	
	
	
		
		

	}

}
