package testcases;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;



  

public class loginTest extends BaseClass {
	
 
	@Test
	public void LoginfailureTest() {
		
		//test = report.startTest("LoginfailureTest");
		
		LoginPage login = new LoginPage();
		
		
		login.LoginFunction("creatorshashikiraan@gmail.com", "Reset@123");
	    
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	    
	    String experror = "The email or password you have entered is invalid.";
	    
	    WebElement error = driver.findElement(By.xpath("//div[@id='msg_box']"));
	    
	    String Acterror= error.getText();
	    
	  /*  if(errmsg.equalsIgnoreCase(Acterror)) {
	    	
	    	System.out.println("Tc is passed");
	    	
	    	
	    }
	    else {
	    	System.out.println("Tc is failed");
	    }
	    
	    
		
	*/
	    Assert.assertEquals(Acterror, experror);
		
		//report.endTest(test);
		
	}
	
	@Test	
	public void LoginSuccesstest() {
		
		LoginPage login = new LoginPage();
		login.LoginFunction("creatorshashikiran@gmail.com", "Reset@123");
	}
	    
	   @Test
	   @Parameters({"param1","param2"})
	   public void ParameterizedTest(String username, String password) {
		   LoginPage login = new LoginPage();
			login.LoginFunction(username, password);
		   
	   }
	   
	   @Test
	   public void ExternalDataTest() {
		   String username = sheet.getRow(0).getCell(0).getStringCellValue();
		   String password = sheet.getRow(0).getCell(1).getStringCellValue();
		   
		    LoginPage login = new LoginPage();
			login.LoginFunction(username, password);
		   
	   }
		
	}


