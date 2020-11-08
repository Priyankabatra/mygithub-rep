package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/merge_pdf");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		//WebElement uploadfile =	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
		
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).sendKeys("C:\\Users\\home\\Desktop\\Resume.pdf");  

		//uploadfile.sendKeys("C:\\Users\\home\\Desktop\\Resume.pdf");
	//	uploadfile.sendKeys("D:\\Priyanka\\Imp Resume\\Coursera-Big data certificate.pdf");
		
	//	driver.findElement(By.xpath("//div[@id='processTaskWrapper']/following-sibling::button[1]")).click();
		
	}

}
