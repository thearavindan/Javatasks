package task20selenium;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginguvi {

	public static void main(String[] args) throws IOException, InterruptedException {
		//initializing the browser
		WebDriver driver = new ChromeDriver();
		String actualurl = "https://www.guvi.in/";
		driver.get(actualurl);
		driver.manage().window().maximize();
		
		//adding implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating the elements by findelements method and entering the details by sendkeys
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("email")).sendKeys("aravindj61@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aravind261296#");
		driver.findElement(By.id("login-btn")).click();
		
		//getting current url for verification 
		String currenturl = driver.getCurrentUrl();
		
		
		//clicking the signup button using click method
		if(currenturl.equals(actualurl)) {
			System.out.println("login failed");
		}else {
			System.out.println("Login successfully");
		}
		
		//verifying the successful registration using screenshot
         TakesScreenshot screenshot = ((TakesScreenshot)driver);
         File source = screenshot.getScreenshotAs(OutputType.FILE);
         File dest = new File("snap/Loginguvi.png");
         FileUtils.copyFile(source, dest);
         
         //driver closing
         driver.close();
	}

}
