package task17selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {
public static void main(String[] args) throws InterruptedException {
	//launching browser
	WebDriver driver = new ChromeDriver();
	
	//storing the url value in string
	String loginurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	//passing the url
	driver.get(loginurl);
	
	//maximizing the window
	driver.manage().window().maximize();
	
	//setting wait time
	Thread.sleep(3000);
	
	//sending the value to username filed
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//sending the value to passward filed
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	//attempting to login
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//capturing the current url for validation purpose
	String currenturl = driver.getCurrentUrl();
	
	//validating for successful login
	if(loginurl.equals(currenturl)) {
		System.out.println("login failed");
	}else {
		System.out.println("login Successful");
	}
	//closing the drivwe
	driver.close();
}

}


