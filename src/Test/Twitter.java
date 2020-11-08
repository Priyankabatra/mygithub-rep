package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.get("https://twitter.com/");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Priyanka Batra");
		driver.findElement(By.name("phone_number")).sendKeys("9899369013");
		
		driver.findElement(By.xpath("//select[@aria-label='Month']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[@value='2'])[1]")).click();
		
		driver.findElement(By.xpath("//select[@aria-label='Day']")).click();
		driver.findElement(By.xpath("//option[@value='24']")).click();
		
		driver.findElement(By.xpath("//select[@aria-label='Year']")).click();
		driver.findElement(By.xpath("//option[@value='1997']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text( )='Next']")).click();
		driver.close();
		
		
		

	}

}
