package KeywordPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//@Test(invocationCount=5)      //43327 ==>high time==>serial
@Test(invocationCount=5,threadPoolSize=5)      // ==>less  time==> parallel
public class InvocationCountwithThreadpoolsize {
public void openBrowser() {
	//Code to launch the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NUTAN\\Desktop\\selenium\\chrome driver 100\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.close();
}
}
