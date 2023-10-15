package task16selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Firefox {
	public static void main(String[] args) {
		//launching the firefox browser
		WebDriver driver =  new FirefoxDriver();
		//maximize the webpage
		driver.manage().window().maximize();
		//navigating to the url
		  driver.get("https://www.google.com/");
	    //refreshing the page
		driver.navigate().refresh();
		//entering the current url in print statement
		System.out.println(" the currt url is : " +driver.getCurrentUrl());
		//closing the browser
		driver.close();
	
		
	}

}
