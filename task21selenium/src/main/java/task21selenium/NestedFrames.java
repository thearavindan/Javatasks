package task21selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		//initializing chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switching to top frame
		WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topframe);
		
		//switching to left frame and getting text
		WebElement leftframe = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftframe);
		String left = driver.findElement(By.tagName("body")).getText();
		System.out.println("text in the left frame : "+left);
		
		//switching to middle frame and getting text
		driver.switchTo().parentFrame();
		WebElement middleframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(middleframe);
		String middle = driver.findElement(By.tagName("body")).getText();
		System.out.println("text in the middle frame : "+middle);
		
		//switching to right frame and getting text
		driver.switchTo().parentFrame();
		WebElement rightframe = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(rightframe);
		String right = driver.findElement(By.tagName("body")).getText();
		System.out.println("text in the right frame : "+right);
		
		//switching to bottom frame and getting text
		driver.switchTo().defaultContent();
		WebElement bottomframe = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottomframe);
		String bottom = driver.findElement(By.tagName("body")).getText();
		System.out.println("text in the bottom frame : "+bottom);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		
		driver.close();
		

	}

}
