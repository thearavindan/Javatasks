package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.Homepage;

public class TC001_SignupTest extends ProjectSpec {
	@BeforeTest
	public void setup() {
		excelfile = "demoblaze"; 
	}
	@Test(dataProvider = "getdata")
public void signuptest(String user, String passs)  {
	new Homepage(driver)
	.clicksignup()
	.username(user)
	.passward(passs)
	.clicksignupbutton()
	.alerts();

}
}
