package Testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class datatestng {
  @Test(dataProvider = "dp")
  public void f(String name, String email,String password,String gender) {
	  
	  System.out.println(name+password);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    new Object[]  {"abc","1234","password","gender"},
    new Object[]  {"def","5678","password","gender"},
    new Object[]  {"priy","98525","password","gender"},
    new Object[]  {"monika","520","password","gender"},
    new Object[]  {"hehjk","5230","password","gender"},
    new Object[]  {"hehjk","5230","password","gender"},
    new Object[]  {"hehjk","5230","password","gender"},
    };
  }
}
