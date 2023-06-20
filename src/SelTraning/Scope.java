package SelTraning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");	
		
		//give me the count of link on the web page
		System.out.println(driver.findElements(By.tagName("a")).size());  //findElements - size 
		
		//count only  footer section 
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); 	  		// Limiting WebDriver Scope	to footer section only 	
		System.out.println(footerDriver.findElements(By.tagName("a")).size());  //findElements - size 
		
		//count only  footer column left section 
		WebElement columnDriver =  driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		List<WebElement> column = columnDriver.findElements(By.tagName("a"));
		
		//check on each link in the column and check if the pages are opening in new tab
		for(int i= 1; i<column.size();i++) 
		{
			
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); //Simulate pressing many keys at once in a "chord". Takes a sequence of Keys.XXXX or strings;appends each of the values to a string, and adds the chord termination key (Keys.NULL) andreturns the resultant string.Note: When the low-level webdriver key handlers see Keys.NULL, active modifier keys(CTRL/ALT/SHIFT/etc) release via a keyup event.
			column.get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
			
		}	//opens all the tab 
		
			Set<String> Windows = driver.getWindowHandles();//4 windows
			Iterator<String> it = Windows.iterator(); 		//iterate
		
			while(it.hasNext()) 	//next index is present or not
			{
				driver.switchTo().window(it.next()); 		//it.next : actually moves to next index 
				System.out.println(driver.getTitle());
			}	
		
		
		

	}

}
