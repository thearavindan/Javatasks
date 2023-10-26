package task18selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// launching the chrome
		WebDriver driver = new ChromeDriver();
				
		//passing the url
		driver.get("https://jqueryui.com/droppable/");
				
		// maximizing the screen
		driver.manage().window().maximize();
				
		//adding wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switching to iframe
		driver.switchTo().frame(0);
	
		//locating the drag element and storing it web element
	     WebElement source =driver.findElement(By.id("draggable"));
	 
	    //locating the drop element and storing it web element
	     WebElement desti =driver.findElement(By.id("droppable"));
	 
	     //creating the action class to perform drag and drop operation
	     Actions builder = new Actions(driver);
	 
	     //performing the operation
	     builder.dragAndDrop(source, desti).perform();
	
	     //getting the css value
	     System.out.println("the background colour is : " +desti.getCssValue("background"));
	
	     //getting the text value
	System.out.println("the text is : " +desti.getText());
	
	//closing the driver
	driver.close();
	
	}

}
