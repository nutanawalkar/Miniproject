package TestAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC3 {
	@BeforeTest
	public void openDB() {
		System.out.println("DB is opened.");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("DB is closed");
	}
	
	@BeforeClass
	public void openbrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	@Test
	public void m2() {
		System.out.println("This is m2 method");
	}
	
	@Test
	public void m3() {
		System.out.println("This is m3 method");
	}
	
}
