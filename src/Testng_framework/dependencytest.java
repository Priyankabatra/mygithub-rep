package Testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class dependencytest {
  @Test(priority = 1)
  public void f1(){
	  int a= 10;
	  int b= 20;
	  System.out.println(a+b);
  }
  
  @Test(priority = 2)
  public void f2() {
	  int a= 10;
	  int b= 20;
	  System.out.println(a*b);
  }
  
  @Test(priority = 4,dependsOnMethods= {"f4","f2"})
  public void f3() {
	  int a= 10;
	  int b= 20;
	  System.out.println(a-b);
  }
  @Test(priority = 3)
  public void f4() {
	  int a= 10;
	  int b= 0;
	  System.out.println(a/b);
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
