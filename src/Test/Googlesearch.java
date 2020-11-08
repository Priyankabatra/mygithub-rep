package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
       
		//open Google
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/"); //Url of Google
		
		//maximise the window
		driver.manage().window().maximize();
		
		//Search for Selenium Ques
		driver.findElement(By.name("q")).sendKeys("Selenium Interview questions");
		Thread.sleep(3000); //3000 = 3seconds
		driver.findElement(By.name("q")).submit();
		
		//Open one website of questions
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//h3[text()='Top 30 Selenium Interview Questions and Answers in 2020']")).click();
		
		//close the browser
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
