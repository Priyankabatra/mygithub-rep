package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ultimatelogin {

	public ultimatelogin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
         //open website
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://courses.ultimateqa.com/users/sign_in");
	     driver.manage().window().maximize();
	     
	     //login
	     Thread.sleep(5000);
	     driver.findElement(By.id("user[email]")).sendKeys("mail2priyankabatra@gmail.com");
	     
	     //password
	     Thread.sleep(5000);
	     driver.findElement(By.id("user[password]")).sendKeys("523012345");
	     
	     //Remember me checkbox
	     Thread.sleep(5000);
	     driver.findElement(By.id("user[remember_me]")).click();
	     
	     //button click
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//input[contains(@class,'button button-primary')]")).click();
	}

}
