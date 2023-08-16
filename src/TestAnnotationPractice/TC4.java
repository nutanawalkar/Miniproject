package TestAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC4 {
	@BeforeClass
	public void openbrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("Browser is closed");
	}

	@Test
	public void m4() {
		System.out.println("This is m4 method");
	}
	
	
	@Test
	public void m5() {
		System.out.println("This is m5 method");
	}
	
	@Test
	public void m6() {
		System.out.println("This is m6 method");
	}
}


