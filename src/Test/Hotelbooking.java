package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hotelbooking {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//search for place-Goa and date then search
		driver.findElement(By.id("ss")).sendKeys("Goa,India");
	    driver.findElement(By.xpath("(//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb'])[1]")).click();
	    driver.findElement(By.xpath("//span[@aria-label='15 October 2020']")).click();

	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='bk-icon -experiments-calendar sb-date-picker_icon-svg'])[2]")).click();
        //driver.findElement(By.xpath("//span[@aria-label='25 July 2020']")).click();
		
		 Thread.sleep(1000);
         driver.findElement(By.xpath("//BUTTON[@data-sb-id='main']")).click();
         
         //sort by budget 
          Thread.sleep(2000);
          driver.findElement(By.xpath("//h3[@class='filtercategory-title']")).click();
          driver.findElement(By.xpath("//a[@data-id='pri-1']")).click();
          
          //sort by Stars
          Thread.sleep(2000);
          driver.findElement(By.linkText("Stars")).click();
          driver.findElement(By.xpath("(//a[@class='sort_suboption'])[1]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//img[@alt='Inn Coconut']")).click();
          
          //Explicit Wait 2 lines
        //  WebDriverWait wait= new WebDriverWait(driver,5);
         // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id='hp_book_now_button'])[2]")));
          
        //  driver.findElement(By.xpath("(//button[@id='hp_book_now_button'])[2]")).click();
        //  driver.findElement(By.xpath("//select[@data-room-id='616742001']")).click();
        //  driver.findElement(By.xpath("(//option[@value='1'])[7]")).click();
          
         // Thread.sleep(2000);
        //  driver.findElement(By.xpath("(//option[@value='1'])[7]")).click();
          Thread.sleep(15000);
          driver.findElement(By.xpath("//div[@class='hprt-reservation-cta']")).click();
          
          driver.close();
          
          
          
          
	}

}
