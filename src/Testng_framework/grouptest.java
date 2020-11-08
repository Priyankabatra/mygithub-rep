package Testng_framework;

import org.testng.annotations.Test;

public class grouptest {
  @Test(groups= {"login"})
  public void f1() {
	  System.out.println("function 1");
  }
  @Test(groups= {"search"})
  public void f2() {
	  System.out.println("function 2");
  }
  @Test(groups= {"login"})
  public void f3() {
	  System.out.println("function 3");
  }
  @Test(groups= {"search"})
  public void f4() {
	  System.out.println("function 4");
  }
  @Test(groups= {"login"})
  public void f5() {
	  System.out.println("function 5");
  }
}
