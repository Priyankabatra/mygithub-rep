package Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newGmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//driver setup
	//	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chromedriver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/" );
		
		//gmail 
		driver.findElement(By.linkText("Gmail")).click();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//signin
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(5000);
		
		//swicthing tab
       Set<String>  s= driver.getWindowHandles();
		
		System.out.println(s.size());
		for(String win : s) {
			
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Gmail")) {
			
	
		//emailid		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("mail2priyankabatra");
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']/following-sibling::div[1]")).click();
        
       Thread.sleep(2000); 
        //pwd
        driver.findElement(By.xpath("//input[@data-initial-dir='ltr']")).sendKeys("9899369033p");
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']/following-sibling::div")).click();
        
        Thread.sleep(5000);
       //compose
        driver.findElement(By.xpath("//div[@jslog='20510; u014N:cOuCgd,Kr2w4b']")).click();
        
        Thread.sleep(5000);
        
        //driver.findElement(By.name("to")).sendKeys("monika6.jain2015@gmail.com");
        driver.findElement(By.name("to")).sendKeys("mail2priyankabatra@gmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("HIGH ALERTTTT");
        driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys("hey my name is Priyanka");
        driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys("hey Monika mene ye automation se send kia h mail... i know i am great..thankyou");
        driver.findElement(By.xpath("//div[@data-tooltip-delay='800']")).click();

}
		}}
	}


