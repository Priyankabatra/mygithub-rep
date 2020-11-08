package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naurkriportal {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			
			//open Naukri
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
		//	driver.switchTo().alert().dismiss();
			   Thread.sleep(2000);
			   
			   //Login
			   driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Login|Login Icon']")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("mail2priyankabatra@gmail.com");
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9899369033p");
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//button[@type='submit']")).click();
			   
			   //Search
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//input[@class='sugInp']")).sendKeys("Software Testing");
			   Thread.sleep(2000);
			   driver.findElement(By.id("qsb-location-sugg")).sendKeys("New Delhi");
			   Thread.sleep(2000);
			   driver.findElement(By.tagName("button")).click();
		
		
		

	}

}
