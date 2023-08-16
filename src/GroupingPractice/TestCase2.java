package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase {
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() {
		System.out.println("Browser Launched");
	}
	
	
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Browser Closed");
	}
	
	@Test(groups="smoke")
	public void Test4() {
		System.out.println("Test4");
	}
	
	
	@Test(groups="functional")
	public void Test5() {
		System.out.println("Test5");
	}
	
	@Test(groups= {"functional","regression"})
	public void Test6() {
		System.out.println("Test6");
	}
}
