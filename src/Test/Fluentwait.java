package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait {

	public static void main(String[] args) throws Exception {
		test();
		
	}
		
	public static void test() throws Exception{

      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
       
       driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium Jobs");
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//input[@type='submit'])[3]")).sendKeys(Keys.ENTER);
       
   
       driver.findElement(By.xpath("(//a[@class='fl']//span)[1]")).click();
       Thread.sleep(2000);
      // driver.findElement(By.xpath("(//div[@class='r']//h3)[2]")).click();
       
       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    	       .withTimeout(30, TimeUnit.SECONDS)
    	       .pollingEvery(5, TimeUnit.SECONDS)
    	       .ignoring(NoSuchElementException.class);

       WebElement element = wait.until(new Function<WebDriver, WebElement>() {
    	     public WebElement apply(WebDriver driver) {
    	    	 WebElement linkElement=driver.findElement(By.xpath("(//div[@class='r']//h3)[2]"));
    	    	 
    	    	  if (linkElement.isEnabled()) {
    	    	    	 System.out.println("Element found");
    	    	       
    	     }
    	    	  return linkElement;
    	   }});
   element.click();
	
    //   driver.close();
    //   driver.quit();
	}
}
