package KeywordPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCount {
	@BeforeClass
 public void launchbrowser() {
	 System.out.println("Browser is launched");
 }
	@AfterClass
 public void closebrowser() {
	 System.out.println("Browser is closed");
 }
	@BeforeMethod
 public void login() {
		System.out.println("login is successful");
 }
	@AfterMethod
 public void loglogout() {
		System.out.println("logout is successful");
 }
	@Test(priority=1)
 public void Homepage() {
		System.out.println("Home page is tested");
}
	@Test(priority=2,invocationCount=5)
 public void Profilepage() {
		System.out.println("Profile page is tested");
}
}
