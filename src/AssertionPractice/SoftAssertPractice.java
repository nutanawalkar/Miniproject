package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	



	//Hard assert:any test case contains multiple Assertion ,if any one fails the next will not be checked==>skipped
	//Soft assert:object oriented==>non static method
	/*@Test
	public void sample1() {
		String Str1="Hello"; 
		System.out.println(Str1);
		Assert.assertEquals(Str1, "Hi");     //fail
	
		String Str2="Hi";  
		System.out.println(Str2);
		Assert.assertEquals(Str2, "Hi");     //pass
	}
	@Test
	public void sample2() {
		System.out.println("Automation");
	}
	*/
	
	@Test
	public void sample1() {
		SoftAssert soft=new SoftAssert();
		String Str1="Hello"; 
		System.out.println(Str1);
		soft.assertEquals(Str1,"Hi");
	
		String Str2="Hi";  
		System.out.println(Str2);
		soft.assertEquals(Str2, "Hi");     //pass
		soft.assertAll();
	}
	
	

	@Test
	public void sample2() {
		System.out.println("Automation");
	}
	
}
