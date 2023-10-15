package task16selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		//initialize the browser
		WebDriver driver = new ChromeDriver();
		//navigate to the page
		driver.get("https://www.demoblaze.com/");
		//maximize the page
		driver.manage().window().maximize();
		//getting the title of the page and storing it in a string variable
		String actualname = driver.getTitle();
		//storing the expectaced name for the title
		String expectedname = "Store";
		//checking the actual name matches with the expected name
		if (actualname.equals(expectedname)) {
			System.out.println("page landed on correct website");
		}else {
			System.out.println("page landed on correct website");
		}
		driver.close();
	}

}
