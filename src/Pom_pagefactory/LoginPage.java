package Pom_pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {

	// Declaration
	
	@FindBy(xpath="//img[contains(@class,'fb_logo')]") private WebElement login_fblogo;
	@FindBy(xpath="//h2[contains(text(),'helps you connect and share with the')]") private WebElement login_fbtagline;
	@FindBy (id="email") private WebElement username;
	@FindBy (id="pass") private WebElement password;
	@FindBy (name="login") private WebElement login_btn;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgot_password;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement createnew_account;
	@FindBy (xpath="//a[text()='Create a Page']") private WebElement createpage_link;
	@FindBys({ @FindBy(xpath="//ul[contains(@class,'uiList pageFooterLinkList')]/li/a") }) private List<WebElement> footer_links;
	
	// Initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// Usage
	public void verifyFacebookLoginPageLogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(), "Facebook Login Page Logo is not displayed");
		Reporter.log("verifyFacebookLoginPageLogo", true);
	}
	
	public void verifyFacebookLoginPageTagline() {
		Assert.assertTrue(login_fbtagline.isDisplayed(), "Facebook Login Page Tagline is not displayed");
		Assert.assertEquals(login_fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
		Reporter.log("verifyFacebookLoginPageTagline", true);
	}
	
	public void verifyFacebookLoginPageForgotPasswordLink() {
		Assert.assertTrue(forgot_password.isDisplayed());
		Assert.assertEquals(forgot_password.getText(), "Forgotten password?");
		Reporter.log("verifyFacebookLoginPageForgotPasswordLink", true);
	}
	
	public void verifyFacebookLoginPageCreatePageLink() {
		Assert.assertTrue(createpage_link.isDisplayed());
		Reporter.log("verifyFacebookLoginPageCreatePageLink", true);
	}
	
	
	public void setFacebookLoginPageUsername() {
		username.sendKeys("ABC");
		Reporter.log("setFacebookLoginPageUsername", true);
	}
	
	
	public void setFacebookLoginPagePassword() {
		password.sendKeys("ABC@123456789");
		Reporter.log("setFacebookLoginPagePassword", true);
	}
	
	public void clickFacebookLoginPageLoginBtn() {
		Assert.assertTrue(login_btn.isDisplayed());
		//login_btn.click();
		Reporter.log("clickFacebookLoginPageLoginBtn", true);
	}
	
	public void clickFacebookLoginPageCreateNewAccBtn() {
		Assert.assertTrue(createnew_account.isDisplayed());
		Assert.assertEquals(createnew_account.getText(), "Create New Account");
		Reporter.log("clickFacebookLoginPageCreateNewAccBtn", true);
	}
	
	public void verifyFacebookLoginPageFooterLinksSize() {
		Assert.assertEquals(footer_links.size(), 30);
		Reporter.log("verifyFacebookLoginPageFooterLinksSize", true);
	}
}
