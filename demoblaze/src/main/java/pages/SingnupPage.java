package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.ProjectSpec;

public class SingnupPage extends ProjectSpec{
@FindBy(id="sign-username")
WebElement username;

@FindBy(id="sign-password")
WebElement password;

@FindBy(xpath="//button[text()='Sign up']")
WebElement signupclick;

public SingnupPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public SingnupPage username(String name) {
	sendkeys(username, name);
	return this;
}
	
	public SingnupPage passward(String pass) {
		sendkeys(password, pass);
		return this;
	}
	
	public SingnupPage clicksignupbutton() {
		click(signupclick);
	return this;
	}
		
    public SingnupPage alerts()  {
	     alert();
			return this;
		}

	
}
