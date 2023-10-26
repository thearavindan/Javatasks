package task18selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		// launching the chrome
		WebDriver driver = new ChromeDriver();
		
		//passing the url
		driver.get("https://www.facebook.com/");
		
		// maximizing the screen
		driver.manage().window().maximize();
		
		//adding wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//getting the current url
		String url = driver.getCurrentUrl();
		
		//Verifying that the website has been redirected to the Facebook homepage.
		if(url.equals("https://www.facebook.com/")) {
			System.out.println("navigated to correct link");
		}else {
			System.out.println("not navigated to correct link");
		}
		
		//Click on the "Create new account" button.
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Entering the first name as "Test" in the respective field
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Test");
		
		//Entering last name as "User" in the respective field
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("User");
		
		//Entering a valid email address in the email field.
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("testuser@test.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("testuser@test.com");
		
		// Entering a strong password in the password field.
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Testuser@123#");
		
		// Selecting the date of birth as "11". month as "May", and year as "1985" using the drop-down
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select option1 = new Select(day);
		option1.selectByVisibleText("11");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select option2 = new Select(month);
		option2.selectByVisibleText("May");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select option3 = new Select(year);
		option3.selectByVisibleText("1985");
		
		//Select the gender as "Male" using the radio button.
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    
	    //Click on the "Sign Up" button.
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		/*Verify that the user is successfully registered on Facebook
		    and redirected to the Facebook*/
		String currenturl = driver.getCurrentUrl();
		if(currenturl.equals("https://www.facebook.com/")){
			System.out.println("not login successfully");
			Thread.sleep(5000);
			WebElement ele=	driver.findElement(By.xpath("//div[contains(@id,'reg_error_inner')]"));
			String msg = ele.getText(); //getting the error message
			System.out.println(msg);
			
			
		}else {
			System.out.println("login successfully");
		}
	driver.close();
	}

}
