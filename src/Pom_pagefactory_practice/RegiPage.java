package Pom_pagefactory_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegiPage {
	//Xpaths and varification methods==>testng
	
		//1.declaration ==>maintain the xpaths and replace findelement by==>@findby
		//2.Initialization==>pagefactory class==>initelements method==>it will initialize our class members
		//3.Usage==>define user action specific methods
		
		//driver.findelement(By.xpath("expression"));
		
		//declarration
		@FindBy(xpath="//img[@title='OpenCart - Account Register']") private WebElement Opencart_logo;   //private help us to restict the access within the class itselef
		@FindBy(xpath="//a[@class=\"btn btn-black navbar-btn\"]") private WebElement Register_acc;
		@FindBy(xpath="username") private WebElement username;
		@FindBy(xpath="firstname") private WebElement firstname;
		@FindBy(xpath="lastname") private WebElement surname;
		@FindBy(xpath="email") private WebElement email;
		@FindBy(xpath="//select[@id='input-country']") private WebElement country;
		@FindBy(xpath="password") private WebElement password; 
		@FindBy(xpath="//button[@class=\"btn btn-primary btn-lg hidden-xs\"]") private WebElement registerbtn;
		
		//initialization==>declare class constructor with public access
		public void RegitrationPage(WebDriver driver) { //driver is taken as an input,by using this input it will initialize registration page elements
			PageFactory.initElements(driver, this); //this calss representing to the registration page
		}
		
		//usage
		public void clickOpencartRegister_acc() {
			Register_acc.click();
		}
		
		public void verifyRegiPageOpencartLogo() {
			Assert.assertTrue(Opencart_logo.isDisplayed(), "The Opencart logo on Registrion page is not displayed ");
		}
		
		public void setRegiPageFirstName() {
			firstname.sendKeys("ABC");
		}
		public void setRegiPageLastName() {
			surname.sendKeys("ABCpqr");
		}
		public void setRegiPageEmail() {
			email.sendKeys("45673890222");
		}
		public void setRegiCountry() {
			Assert.assertTrue(country.isDisplayed(), "country is not displayed");
			Assert.assertFalse(country.isSelected());  //assertfalse will pass the test case when both condition become false or not matching
			Select c=new Select(country);
			c.selectByVisibleText("India");
		}
		public void setRegiPagePassword() {
			password.sendKeys("@123");
		}
		public void clickRegiPageSubmitbtn() {
			registerbtn.click();
		}
		
}
