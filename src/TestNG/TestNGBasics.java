package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestNGBasics {
	
	   
		
	   @Test(priority=2)
		public void login() {
			System.out.println("login is successful");
			Reporter.log("login is successful");
		}
		@Test(priority=3)
		public void logout() {
			System.out.println("logout is successful");
			Reporter.log("logout is successful");
		}
		@Test(priority=1)
		public void openurl() {
			System.out.println("Url is opened");
			Reporter.log("Url is opened");
		}
		
}
