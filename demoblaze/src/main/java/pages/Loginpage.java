package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpec;

public class Loginpage extends ProjectSpec {
	@FindBy(id = "loginusername")
	WebElement username;
	
	@FindBy(id = "loginpassword")
	WebElement passward;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginclick;
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public Loginpage loginuser(String user) {
	sendkeys(username, user);
	return this;
}

public Loginpage loginpass(String pass) {
	sendkeys(passward, pass);
	return this;
}

public Loginpage clickloginbutton() {
	click(loginclick);
	return this;
}
}
