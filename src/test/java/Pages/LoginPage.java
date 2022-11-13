package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	
	ExtentTest test = BaseClass.test;
	
	
	@FindBy(className= "login")
	WebElement loginlink;
	
	@FindBy(xpath="//input[@name='user_login']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@name='user_pwd']")
	WebElement pwd;
	
	@FindBy(xpath="//label[@class='rememberMe']")
	WebElement remindbt;
	
	@FindBy(xpath="//input[@name='btn_login']")
	WebElement login;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	 public void LoginFunction(String username, String password) {
			
	     
		    loginlink.click();
		    
		    test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");


		    email.sendKeys(username);
		    
		    test.log(LogStatus.PASS, "Enter email", "Entered email successfully");


		    pwd.sendKeys(password);
		    
		    test.log(LogStatus.PASS, "Enter Password", "Entered password successfully");


		    remindbt.click();
		    
		    test.log(LogStatus.PASS, "Click on reminder button", "Reminder button clicked successfully");


		    login.click();
		    test.log(LogStatus.PASS, "Click on Login button", "Logied in successfully");


		    

}
}
