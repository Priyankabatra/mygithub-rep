package Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//open Amazon
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		
		//Select watches from dropdown
		driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@ value='search-alias=watches']")).click();
		driver.findElement(By.xpath("//input[@ type='submit']")).click();

       //Go to brand and select Brand then Fastrack		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h4[@class='a-size-small a-spacing-mini a-color-base a-text-bold'])[4]")).click();
        driver.findElement(By.xpath("//span[text()='Fastrack']")).click();
        Thread.sleep(5000);
        
        //click on Sort by then Select Low to High
        driver.findElement(By.xpath("//span[@class='a-button-inner'][1] ")).click();
        driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")).click();
       Thread.sleep(2000);
     
       //Click on Second watch  
      driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal']//span)[3]")).click();
      
      //Tab switching code
      Set<String> w = driver.getWindowHandles();
      for(String newwh:w) {
    	  String title = driver.switchTo().window(newwh).getTitle(); 	
         }
	   
      //Watch will get added to Cart
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
       driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
      
     //  driver.close();
}
	}
