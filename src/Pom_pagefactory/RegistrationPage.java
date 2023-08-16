package Pom_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
	//Xpaths and varification methods==>testng
	
	//1.declaration ==>maintain the xpaths and replace findelement by==>@findby
	//2.Initialization==>pagefactory class==>initelements method==>it will initialize our class members
	//3.Usage==>define user action specific methods
	
	//driver.findelement(By.xpath("expression"));
	
	//declaration
	@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_fblogo;   //private help us to restict the access within the class itselef
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement mob_email;
	@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement password; 
	@FindBy(name="birthday_day") private WebElement birthday;
	@FindBy(name="birthday_month") private WebElement birthmonth;
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy(name="websubmit") private WebElement submitbtn;
	
	//initialization==>declare class constructor with public access
	public RegistrationPage(WebDriver driver) { //driver is taken as an input,by using this input it will initialize registration page elements
		PageFactory.initElements(driver, this); //this calss representing to the registration page
	}
	
	//usage
	public void clickFacebookSignupLink() {
		signuplink.click();
	}
	
	public void verifyFacebookRegistrationPageFbLogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(), "The facebook logo on Registrion page is not displayed ");
	}
	
	public void verifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(), "Already having acc is not displayed ");
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	
	public void setFacebookRegistrationPageFirstName() {
		firstname.sendKeys("ABC");
	}
	public void setFacebookRegistrationPageLastName() {
		surname.sendKeys("ABCLMN");
	}
	public void setFacebookRegistrationPageMobileEmail() {
		mob_email.sendKeys("4567389022");
	}
	public void setFacebookRegistrationPagePassword() {
		password.sendKeys("nutan@123");
	}
	public void setFacebookRegistrationPageBirthDay() {
		Assert.assertTrue(birthday.isDisplayed(), "birthday is not displayed");
		Assert.assertFalse(birthday.isSelected());  //assertfalse will pass the test case when both condition become false or not matching
		Select bday=new Select(birthday);
		bday.selectByVisibleText("12");
	}
	public void setFacebookRegistrationPageBirthMonth() {
		Assert.assertTrue(birthday.isDisplayed(), "birthday is not displayed");
		Assert.assertFalse(birthday.isSelected());  //assertfalse will pass the test case when both condition become false or not matching
		Select bmonth=new Select(birthmonth);
		bmonth.selectByVisibleText("Mar");
		Assert.assertEquals(bmonth.getFirstSelectedOption().getText(), "Mar");
	}
	public void setFacebookRegistrationPageBirthYear() {
		Assert.assertTrue(birthday.isDisplayed(), "birthday is not displayed");
		Assert.assertFalse(birthday.isSelected());  //assertfalse will pass the test case when both condition become false or not matching
		Select byear=new Select(birthyear);
		byear.selectByVisibleText("1985");
	}
	
	public void setFacebookRegistrationPageGender(String gender) {
		if (gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}
	}
	
	public void clickFacebookRegistrationPageSubmitBtn() {
		submitbtn.click();
	}
	
}
