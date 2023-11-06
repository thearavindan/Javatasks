package task21selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> window = driver.getWindowHandles();
		List<String>screen = new ArrayList<String>(window);
		driver.switchTo().window(screen.get(1));
		String expectedtext = "New Window";
		String actualtext = driver.findElement(By.tagName("h3")).getText();
		System.out.println("texr present in the window : " +actualtext);
		if(actualtext.equals(expectedtext)) {
			System.out.println("new window text is present in new window");
		}else {
			System.out.println("new window text not present in new window");
		}
		driver.close();
		driver.switchTo().window(screen.get(0));
		
		System.out.println();

	}

}
