package task16selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence");
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='History']")).click();
		String name = driver.getTitle();
		System.out.println("the title of the section : " +name);
		driver.close();

	}

}
