package utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilities {
	
	public static WebDriver driver;
	public String excelfile;
	
	public void browser(String url, String browser) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver(options);
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	
	
	public void close() {
		driver.close();
	}
		
		public String[][] readexcel(String excelfile) throws IOException {
			XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Aravind\\eclipse-workspace\\demoblaze\\data\\"+excelfile+".xlsx");
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum();
			int columncount = sheet.getRow(0).getLastCellNum();
			String[][] data = new String[rowcount][columncount];
			for(int i=1;i<=rowcount;i++) {
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<columncount;j++) {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
					System.out.println(cell.getStringCellValue());
				}
			}
			book.close();
			return data;
		}
		
	 
		public void click(WebElement element) {
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	     wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}

		public void sendkeys(WebElement ele, String values) {
			ele.sendKeys(values);
		}
		
		public void alert()  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		
		
		public String takescreenshot(String testmethodname) throws IOException {
			String path = "./snap/"+testmethodname+".png";
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyFile(source, dest);
			return path;
		}

}
