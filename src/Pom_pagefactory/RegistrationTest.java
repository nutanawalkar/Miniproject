package Pom_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	// ALl the test cases
WebDriver driver;
	
	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NUTAN\\Desktop\\selenium\\chrome driver 100\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@Test(testName = "FacebookRPageTest")
	public void FacebookRegistrationPageTest() {
	
		RegistrationPage rgPage= new RegistrationPage(driver);
		rgPage.clickFacebookSignupLink();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/reg/");
		rgPage.verifyFacebookRegistrationPageFbLogo();
		rgPage.verifyFacebookRegistrationPageAlreadyAccount();
		rgPage.setFacebookRegistrationPageFirstName();
		rgPage.setFacebookRegistrationPageLastName();
		rgPage.setFacebookRegistrationPageMobileEmail();
		rgPage.setFacebookRegistrationPagePassword();
		rgPage.setFacebookRegistrationPageBirthDay();
		rgPage.setFacebookRegistrationPageBirthMonth();
		rgPage.setFacebookRegistrationPageBirthYear();
		rgPage.setFacebookRegistrationPageGender("Male");
		rgPage.clickFacebookRegistrationPageSubmitBtn();
	
	}
	
	@AfterClass
	public void tearDown() {//tearDown==>special name to close the browser
		//driver.quit();
	}
	
	
}
