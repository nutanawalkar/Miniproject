package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnnotation {
	@BeforeMethod
	public void login() {
		System.out.println(">>>>>>>>>>>>>>login<<<<<<<<<<<<<<<<<");
		Reporter.log("\">>>>>>>>>>>>>>login<<<<<<<<<<<<<<<<<");
	}
	@AfterMethod
	public void logout() {
		System.out.println(">>>>>>>>>>>>>> logout<<<<<<<<<<<<<<<<<");
		Reporter.log("\">>>>>>>>>>>>>> logout<<<<<<<<<<<<<<<<<");
	}
	
	@Test(priority=1)
	public void HomeElement() {
		System.out.println("Checking the HomePage Url");
		System.out.println("Checking the HomePage Url");
	}
	
	@Test(priority=2)
	public void ProfileCheck() {
		System.out.println("Checking the ProfilePage Url");
		System.out.println("Checking the ProfilePage Url");
	}
	@Test(priority=3)
	public void NotificationCheck() {
		System.out.println("Checking the NotificationPage Url");
		System.out.println("Checking the NotificationPage Url");
	}
}
