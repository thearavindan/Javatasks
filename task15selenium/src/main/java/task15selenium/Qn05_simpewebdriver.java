package task15selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qn05_simpewebdriver {

	public static void main(String[] args) {
		/*  Before coming to java, we have to integrate selenium and 
		 * webdrivers in eclipse,for that i have returned step by step
		 * procedures below :
		 * 1. go  to maven repository and copy the official selenium dependencies
		 * 2.create a maven project in eclipse
		 * 3. after creating project, you will find pom.xml file, there you have 
		 * to create dependencies tag.
		 * 4. inside that tag you have to paste the dependency for selenium you 
		 * have copied.
		 * 5. copy the web driver dependency created by bonigarcia in maven repo,
		 * then paste it inside the dependencies tag in pom.xml.
		 * 6. save the file, then you wil see maven dependencies folder created inside 
		 * you poject.
		 * then
		 * 7. then create a package, create a class inside the package.then create the driver
		 */
		/* webdriver is class where we can create a webdriver for our browser 
		 * by creating a object as seen below.
		 */
		// this code use to launch our crome browser
			WebDriver driver = new ChromeDriver();
			
		// we can pass the url with this line of code
			driver.get("https://www.google.com/");
			
		// we can maxmimize our window by this line of code
			driver.manage().window().maximize();
			
		// we can close our browser by this line of code
			driver.close();
			

	}

}
