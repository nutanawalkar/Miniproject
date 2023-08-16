package Pom_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NUTAN\\Desktop\\selenium\\chrome driver 100\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test(testName = "FacebookLoginPageTest")
	public void FacebookLoginPageTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.verifyFacebookLoginPageLogo();
		lp.verifyFacebookLoginPageTagline();
		lp.verifyFacebookLoginPageForgotPasswordLink();
		lp.verifyFacebookLoginPageCreatePageLink();
		lp.verifyFacebookLoginPageFooterLinksSize();
		lp.setFacebookLoginPageUsername();
		lp.setFacebookLoginPagePassword();
		lp.clickFacebookLoginPageLoginBtn();
		lp.clickFacebookLoginPageCreateNewAccBtn();
	}
	
	
	@AfterClass 
	  public void tearDown() {
	 // driver.quit(); 
	  }
}
