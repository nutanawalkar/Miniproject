package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	//Assert:use to verify scenarios
		//static methods ==>hard assert==>classname.methodname
		
	String Str1="Hello";   //Actual
	String Str2="Hi";     //Expected
	
	
	//Assert Equals() if expected==actual
	@Test
	public void test1() {
		Assert.assertEquals(Str1, Str2);   //fail
	}
	
	//Assert not equals
	@Test
	public void test2() {
		Assert.assertNotEquals(Str1,Str2); //pass
	}
	
	//Assertion Null:test case will pass if provided data is  null
	public void test3() {
		Assert.assertNull(Str1);  //fail
	}
	
	//Assertion not Null:test case will pass if provided data is not null
		public void test4() {
			Assert.assertNull(Str1);  //pass
		}
		
}
