package KeywordPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
	@Test(priority=1)
	public void openurl() {
		System.out.println("Url is opened");
		Reporter.log("Url is opened");
		//Assert.fail();
	}
	@Test(priority=2,dependsOnMethods = "openurl")
	public void login() {
		System.out.println("login is successful");
		Reporter.log("login is successful");
	}
	@Test(priority=3,dependsOnMethods = {"openurl","login"})
	public void logout() {
		System.out.println("logout is successful");
		Reporter.log("logout is successful");
	}
	
}
