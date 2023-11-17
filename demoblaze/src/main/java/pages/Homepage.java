package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpec;

public class Homepage extends ProjectSpec {
	@FindBy(id="signin2")
	WebElement signup;
	
	@FindBy(id="login2")
	WebElement login;
	
public Homepage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	public SingnupPage clicksignup() {
		click(signup);
		return new SingnupPage(driver);
	}
	public Loginpage clicklogin() {
		click(login);
		return new Loginpage(driver);
	}
}
