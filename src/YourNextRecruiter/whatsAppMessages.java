package YourNextRecruiter;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatsAppMessages {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		 String appurl = "https://web.whatsapp.com/";
		 driver.get(appurl);
		 Thread.sleep(15000);
		 System.out.println("Wait successfully done");
		
		List<WebElement> arr = new ArrayList<WebElement>();//Creating array list.
		
		driver.findElement(By.cssSelector("(//span[@class='_3ko75 _5h6Y_ _3Whw5'])[34]")).click();
		//driver.findElement(By.cssSelector("span[title='Screenshots']")).click();

		arr=driver.findElements(By.cssSelector("a[href^='https://api.whatsapp.com/send?phone=']"));
		
		List<String> arr2=new ArrayList<String>();
		
		for(WebElement elem:arr) {
			arr2.add(elem.getText());
		}
		
		System.out.println(arr);
		System.out.println("*******");
		System.out.println(arr2);
		
		
		for (String ele: arr2)
		{
//			System.out.print("In this loop");
//			System.out.println (ele.getText());
			WebElement clickingElem=driver.findElement(By.cssSelector("a[href='"+ele+"']"));
			clickingElem.click();
//			driver.findElement(By.cssSelector("footer div[contenteditable]")).click();
		    driver.findElement(By.cssSelector("footer div[contenteditable]")).sendKeys("*For HDFC*\n" + 
		    //		"\n" + 
		    		"Dear Candidate, \n" + 
		    //		"\n" + 
		    		"You are getting this message as you applied for HDFC Job in Delhi on Facebook\n" + 
		    //		"\n" + 
		    		"Candidate must be Graduate for this opening, if you are eligible (Not B.Tech and Engineering Backgrounds) please fill below form and Acknowledge on following Facebook link with Comment \"Done\".\n" + 
		    //		"\n" + 
		    		"Form to fill:\n" + 
		    		"Fill the form  here\n" + 
		    		"https://forms.gle/sDwhjczjwEfhHfJx5\n" + 
		    		"\n" + 
		    		"FB Link:\n" + 
		    		"https://www.facebook.com/102553348091615/posts/131287008551582/?d=w\n" + 
		    		"\n" + 
		    		"Age - Below 33 Years\n" + 
		    		"\n" + 
		    		"PS: If B.Tech and B.E still want to apply, and Passionate about Sales jobs they can also apply (This is 90% field work and 10% in Office)\n" + 
		    		"\n" + 
		    		"Thanks\n" + 
		    		"YNR - YourNextRecruiter\n" + 
		    		"For job updates - https://www.facebook.com/YNR-Your-Next-Recruiter-102553348091615/\n" + 
		    		"We Don’t charge anything to Candidate");
		    
		   driver.findElement(By.cssSelector("div button span[data-icon='send']")).click();
		    driver.findElement(By.cssSelector("(//span[@class='_3ko75 _5h6Y_ _3Whw5'])[34]")).click();
			Thread.sleep(5000);
		    System.out.print("done");
		}
		 driver.findElement(By.cssSelector("a[href='https://api.whatsapp.com/send?phone=919999623109']")).click();	 
		driver.quit();
	//	https://api.whatsapp.com/send?phone=919999623109"
		}

}
	
	
	
	
