package Test;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click(); //cross(pop up)
		driver.findElement(By.className("LM6RPg")).sendKeys("Ac");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		org.openqa.selenium.WebElement Scroll1 = driver.findElement(By.xpath("(//div[@class='_3xglSm _1iMC4O'])[2]"));
		int x = Scroll1.getLocation().getX();       
		int y = Scroll1.getLocation().getY();

		System.out.println(x+" "+y);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='Voltas'])[2]")).click();

		 java.util.List<org.openqa.selenium.WebElement> ele = driver.findElements(By.className("_3wU53n")) ;
	     java.util.List<org.openqa.selenium.WebElement> ele1 = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
	     // System.out.println(ele1.size());
		 for(int j=0;j<ele1.size();j++) {
			 for(int i=0;i<ele.size();i++)
		 {
			 String price = ele1.get(j).getText();
			 String test = ele.get(i).getText();
		     System.out.println(test+" "+ price);
		 }
	

	}
	}
}

