package YourNextRecruiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleConsultantData {

	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
	//	String[] data = {"Jharkhand","Orissa","Assam"};
		String[] data = {"Assam"};
		//System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver");
		 driver = new ChromeDriver ();
		 
		 String appurl = "https://www.google.com/maps/";
		 driver.get(appurl);
		 
		//Storing the application variable in string variable
		 googleConsultantData obj=new googleConsultantData();
		 
		 System.out.println("**" + data[0]+ "***");
		  obj.runner(data[0]);
		 
//		System.out.println("**" + data[1]+ "***");
		 
		obj.runner(data[1]);
	//	obj.runner(data[2]);
		
		 driver.quit();
		
}
	
	public void runner(String data) throws InterruptedException {
		driver.findElement(By.id("searchboxinput")).clear();
		driver.findElement(By.id("searchboxinput")).sendKeys("Recruitment Consultant in " + data);
		driver.findElement(By.id("searchbox-searchbutton")).click();	
		Thread.sleep(7000);	
				
		for(int j=0;j<20;j++) 
		
		{ 

			for(int i=0;i<20;i++) 
			
			{ 
				System.out.print(i+1 + "]");
				System.out.print(driver.findElements(By.cssSelector("div.section-result h3 span")).get(i).getAttribute("innerText"));
				System.out.print(" $");
				System.out.println(driver.findElements(By.cssSelector("div.section-result span.section-result-phone-number")).get(i).getAttribute("innerText"));
				
			}
			
			driver.findElement(By.className("n7lv7yjyC35__button-next-icon")).click();	
			System.out.print(" ***************** ");
			System.out.println (" ");
			Thread.sleep(7000);


		}
		
		}
			
}

