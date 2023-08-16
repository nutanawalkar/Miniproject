package KeywordPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Timeouts {
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
		@Test(priority=1,timeOut=5000)
	 public void HomepageTest() throws InterruptedException {
		//	Thread.sleep(6000);
			Thread.sleep(4000);
			
			System.out.println("Home page is tested");
	}
		@Test(priority=2,invocationCount=5)
	 public void ProfilepageTest() {
			System.out.println("Profile page is tested");
	}
}
