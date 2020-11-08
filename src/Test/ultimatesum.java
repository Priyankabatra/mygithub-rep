package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ultimatesum {

	public ultimatesum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
	         //open website
			 WebDriver driver = new ChromeDriver();
		     driver.get("https://ultimateqa.com/complicated-page");
		     driver.manage().window().maximize();
		    
		     
		     //name
		     Thread.sleep(5000);
		     driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Priyanka");
		     
		     //emailid
		     Thread.sleep(5000);
		     driver.findElement(By.id("et_pb_contact_email_0")).sendKeys("mail2priyankabatra@gmail.com");
		     
		     //message
		     Thread.sleep(5000);
		     driver.findElement(By.id("et_pb_contact_message_0")).sendKeys("Hello");
		     
		     //sum
		     Thread.sleep(5000);
		    String result = driver.findElement(By.className("et_pb_contact_captcha_question")).getText();
		    System.out.println(result);
		    driver.findElement(By.name("et_pb_contact_captcha_0")).sendKeys("16");
		     
		     //submit button
		     Thread.sleep(5000);
		     driver.findElement(By.xpath("//button[@name='et_builder_submit_button']")).click();

	}

}
