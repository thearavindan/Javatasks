package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.Homepage;

public class TC002_LoginTest extends ProjectSpec {
	@BeforeTest
	public void setup() {
		excelfile = "demoblaze"; 
	}
	@Test(dataProvider = "getdata")
public void logintest(String user, String passs) {
	new Homepage(driver)
	.clicklogin()
	.loginuser(user)
	.loginpass(passs)
	.clickloginbutton();
}

}
