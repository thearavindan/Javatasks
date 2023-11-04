package task22selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravels {
	public static void main(String[] args) throws IOException, InterruptedException {
		//initializing the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//entering the values in the field
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Aravindan");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("R");
		driver.findElement(By.name("business_name")).sendKeys("php travels");
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("aravindan@gmail.com");
		
		//getting the value for sum verification
		String value1 = driver.findElement(By.id("numb1")).getText();
		String value2 = driver.findElement(By.id("numb2")).getText();
		
		//converting the value into integer
		int num1 = Integer.parseInt(value1);
		int num2 = Integer.parseInt(value2);
		int result =num1+num2;
		
		//converting the result into string
		String res = Integer.toString(result);
		
		//passing the result value
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys(res);
		driver.findElement(By.xpath("//button[@id='demo']")).click();
		Thread.sleep(4000);
		
		//getting the text for submission verification
		String text1 = driver.findElement(By.xpath("//strong[text()=' Thank you!']")).getText();
		String text2 = driver.findElement(By.xpath("//p[@class='text-center cw']")).getText();
		
		//validating the submission
		if(text1.contains("Thank")) {
			System.out.println(text1);
			System.out.println(text2);	
		}else {
			System.out.println("form not submitted succwssfully");
		}
		
		//taking screenshot for verification purpose
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("snap/phptravels.png");
		FileUtils.copyFile(source, dest);
		
		//driver closing
		driver.close();

      }
}