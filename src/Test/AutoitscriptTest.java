package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitscriptTest {

	public static void main(String[] args) throws InterruptedException, IOException {

     WebDriver driver=new ChromeDriver();
     driver.get("https://www.timesjobs.com/candidate/register.html?siteparams=3p9901&utm_source=google&utm_medium=cpc&utm_campaign=Sok_Search_NB_Generic&utm_adgroup=Website/portal_Exact&gclid=Cj0KCQjwoaz3BRDnARIsAF1RfLdPiOOLnXskXtTQanG8hU5P68z-GXhYB6hhrGarE6KaBvSHcdr8XyQaAnWVEALw_wcB" );
     driver.manage().window().maximize();
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("(//button['waves-effect waves-light btn gdpr-btn'])[3]")).click();
     
     driver.findElement(By.id("emailAdd")).sendKeys("priyankabatra2402@gmail.com");
     driver.findElement(By.id("emailAdd")).click();
     
     driver.findElement(By.id("passwordField")).sendKeys("9899369033$");
     
     driver.findElement(By.id("retypePassword")).sendKeys("9899369033$");
     driver.findElement(By.id("retypePassword")).click();
     
    driver.findElement(By.id("mobNumber")).sendKeys("9899369033");
    driver.findElement(By.id("mobNumber")).click();
    
    driver.findElement(By.id("defLabelSpnId")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//*[text( )=' Online & Offline Marketing / MR / Media Planning ']")).click();
    
   driver.findElement(By.id("cboWorkExpYear")).sendKeys("0");
   driver.findElement(By.id("cboWorkExpMonth")).sendKeys("0");
   Thread.sleep(2000);
   
   
   driver.findElement(By.id("curLocation")).click();
   driver.findElement(By.xpath("(//option[text( )='Delhi'])[1]")).click();
   driver.findElement(By.xpath("(//input[@type='file'])[1]")).click();
 
  
  
 // Process P=Runtime.getRuntime().exec("");
  
  
   
    
  //     WebElement browsebutton = driver.findElement(By.xpath("//label[@class='form-file-label']"));
 //     browsebutton.submit();

	}

}
