package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeTest(alwaysRun=true)
	public void openDB() {
		System.out.println("Before Test:open the database");
	}
	@AfterTest(alwaysRun=true)
	public void closeDB() {
		System.out.println("After Test:close the database");
	}
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() {
		System.out.println("browser is launched");
	}
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("browser is closed");
	}
	@Test(groups="smoke")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(groups="functional")
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(groups={"functional","regression"})
	public void Test3() {
		System.out.println("Test3");
	}
}
