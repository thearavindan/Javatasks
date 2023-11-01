package task20selenium;

import java.io.File;
import java.time.Duration;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signupguvi {
	public static void main(String[] args) throws IOException {
		//initializing the browser
		WebDriver driver = new ChromeDriver();
		
		//passing the url
		driver.get("https://www.guvi.in/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//adding implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//clicking signup button
		driver.findElement(By.xpath("(//a[text()=\"Sign up\"])[1]")).click();
		
		//locating the elements by findelements method and entering the details by sendkeys
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aravindan R");
		driver.findElement(By.id("email")).sendKeys("aravindj611@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aravind261296#");
		driver.findElement(By.id("mobileNumber")).sendKeys("8778603529");
		
		//clicking the signup button using click method
		driver.findElement(By.id("signup-btn")).click();
		driver.findElement(By.id("laterBtn")).click();
		
		//verifying the successful registration using screenshot
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("snap/signupguvi.png");
		FileUtils.copyFile(source, dest);
		
		//driver closing
		driver.close();
		
		
	}

}
