package Parameterization_CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowserTesting {
	WebDriver driver;
	//1.chrome==>hit the url ==>manage browser activities(behavioral/input domain)
	//2.facebook url ==>actual url and expected url ==>assertion ==>imp scenario ==>use hard assertion
	//3.title of the facebook page
	//4.username field
	//4.password field
	//5.login button
	
	@Parameters("browser")
	@Test(priority=1)
	public void crossbrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\NUTAN\\Desktop\\selenium\\chrome driver 100\\chromedriver.exe");
			 driver = new ChromeDriver(); 
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\NUTAN\\Desktop\\selenium\\gecko driver\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
		     driver = new FirefoxDriver(); 
			
		}else {
			System.out.println("Wrong Browser Selected");
		}
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void VerifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		Reporter.log("VerifyCurrentUrl", true);
		
	}
	
	@Test(priority=3)
	public void VerifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		Reporter.log("VerifyPageTitle", true);
	}
	
	@Test(priority=4)
	public void VerifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(username.isDisplayed());
		Assert.assertTrue(username.isEnabled());
		username.sendKeys("nutan");
		Reporter.log("VerifyUsernameField", true);
	}
	
	@Test(priority=5)
	public void VerifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Assert.assertTrue(password.isDisplayed());
		Assert.assertTrue(password.isEnabled());
		password.sendKeys("nutan@1123");
		Reporter.log("VerifyPasswordField", true);
	}
	
	
	@Test(priority=6)
	public void ClickLoginButton() {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(LoginBtn.isEnabled());
		LoginBtn.click();
	}
	
}
