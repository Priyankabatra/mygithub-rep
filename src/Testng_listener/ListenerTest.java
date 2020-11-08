package Testng_listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerTest {
	WebDriver driver= new ChromeDriver();
 
  @Test(priority=1)
  public void TestToPass()
  {
      System.out.println("This method to pass test");
      driver.get("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/");
      driver.getTitle();
      driver.quit();
  }
  @Test(priority=2)
  public void TestToSkip ()
  {
              System.out.println("This method to skip test");
      throw new SkipException("Skipping - This is not ready for testing ");
  }
  @Test(priority=3)
  public void TestToFail()
  {
      driver.getTitle();
      System.out.println("This method to test fail");
  }
}
