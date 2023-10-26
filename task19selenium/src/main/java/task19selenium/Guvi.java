package task19selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi {
	public static void main(String[] args) {
		// lauching browser
		WebDriver driver = new ChromeDriver();
		
		//passing url
		driver.get("https://www.guvi.in/register/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//adding wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating webelement by id
		driver.findElement(By.id("firstName")).sendKeys("Aravindan");
		
		//locating webelement by id
		driver.findElement(By.id("lastName")).sendKeys("R");
		
		//locating webelement by xpath with tagname and index value
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("asaravind13@gmail.com");
		
		//locating webelement by xpath
		driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("AeioUkp123*");
		
		//locating webelement by css selector
		driver.findElement(By.cssSelector("#mobileNumberInput")).sendKeys("9876543210");
		
		//locating webelement by id
		driver.findElement(By.id("signup")).click();
		
		
		
		
	}

}
