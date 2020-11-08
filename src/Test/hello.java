package Test;

import java.awt.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class hello {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("fb");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('name').values='q'");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//String tit = driver.getTitle();
		//System.out.println(tit);
		//driver.close();
		

		File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("C:\\Users\\home\\Desktop\\screenshot.png"));
		System.out.println("Image is saved");
		
	
		driver.close();

	}
}

