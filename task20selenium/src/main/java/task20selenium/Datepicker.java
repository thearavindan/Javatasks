package task20selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public static void main(String[] args) {
		//initializing the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switching to iframes by index value
		driver.switchTo().frame(0);
		
		//clicking the field to display the calendar
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		
		//slecting the month
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//selecting the date
		driver.findElement(By.xpath("//a[@data-date='22']")).click();
	
		
		//storing the date in String by get text method to print in console
		
		String date = driver.findElement(By.xpath("//a[@data-date='22']")).getText();
		String month =	driver.findElement(By.xpath("//span[text()='December']")).getText();
		String year =	driver.findElement(By.xpath("//span[text()='2023']")).getText();
		
		System.out.println("the selected dats is : "+date+ " " +month+" "+year);
		
		//closing the driver
		driver.close();
	}

}
