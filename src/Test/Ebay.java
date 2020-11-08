package Test;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import okio.Options;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.ebay.com/");
		driver.manage().window().maximize();
		   driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Tablet");
        driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).submit();

        WebElement Scrollnew = driver.findElement(By.xpath("(//h3[@class='x-refine__item'])[3]"));
        int x= Scrollnew.getLocation().getX();
        int y= Scrollnew.getLocation().getY();

        System.out.println(x+" "+y);
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
   	    js.executeScript("window.scrollBy("+x+","+y+")");
   	    
        driver.findElement(By.xpath("((//span[@class='cbx x-refine__multi-select-cbx'])[8]")).click();
        Thread.sleep(3000);
        WebElement Scroll2 = driver.findElement(By.xpath("//h3[.='Operating System']")); 
        int a= Scroll2.getLocation().getX();
        int b= Scroll2.getLocation().getY();
        System.out.println(a+" "+b);
  	    js.executeScript("window.scrollBy("+a+","+b+")");
	//    driver.findElement(By.xpath("//input[@aria-label='Windows 10']")).click();            */

		//Select from drop down menu 

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='gh-sb ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='15032']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).submit();
		driver.quit();

	}

  }
