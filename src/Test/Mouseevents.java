package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseevents {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://dbankdemo.com/login");
		
		WebElement element = driver.findElement(By.id("username"));
		Actions actions = new Actions(driver);
		Action seriesOfActions = actions
				.moveToElement(element)
				.click()
				.keyDown(element, Keys.SHIFT)
				.sendKeys("priyanka")
				.keyUp(element,Keys.SHIFT)
			    .doubleClick()
				.contextClick()
				.keyUp(element,Keys.ESCAPE)
		        .build();
		seriesOfActions.perform();    
		
		//Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("password"));
		Actions actionsnew = new Actions(driver);
		
		actionsnew.moveToElement(element1).click().build().perform();
		Thread.sleep(1000);
		actionsnew.moveToElement(element1).sendKeys("123").build().perform();
		Thread.sleep(1000);
			}

}
