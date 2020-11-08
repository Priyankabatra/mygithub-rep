package Testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {
  
	 @Test(priority = 1)
	  public void registrationPage() {
		  
		  System.out.println("in registration page ");
	  }
	  
	  @Test(priority = 3,enabled = false)
	  public void homePage() {
		  
		  System.out.println("in home page test");
	  }
	  
	  @Test(priority = 4)
	  public void searchPage() {
		  
		  	System.out.println("in search page");
	  }
	  @Test(priority = 2)
	  public void loginPage() {
		  System.out.println("in login page");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("in before method ");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("in after method ");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("in before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("in after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("in before test ");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("in before suite ");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("in after suite");
	  }
	  
	  @AfterTest
	  public void afterTeest() {
		  System.out.println("in after test ");
	  }
}
