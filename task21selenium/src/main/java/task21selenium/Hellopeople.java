package task21selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hellopeople {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/iframe");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement frame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.tagName("p")).clear();
	driver.findElement(By.tagName("p")).sendKeys("hello people");
	
	

	}

}
