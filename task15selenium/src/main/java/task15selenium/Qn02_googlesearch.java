package task15selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qn02_googlesearch {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("APjFqb")).sendKeys("selenium browser driver");
	 driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	driver.close();
	

	}

}
