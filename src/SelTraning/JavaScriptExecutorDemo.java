package SelTraning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =  (JavascriptExecutor)driver; //casting driver to javascript executor
		js.executeScript("window.scroll(0,500)");	// window level scrolling 	
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //within table level srcolling [document  refers to DOM, and query selector  is referred to css selector in Javascript]
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		
		for(int i = 0; i<values.size();i++)
		{
			//System.out.println(Integer.parseInt(values.get(i).getText()));
			sum = sum + Integer.parseInt(values.get(i).getText()); // 28,51,99,117,117,149,195,232,263,296
			//System.out.print(sum);
		}
		System.out.println(sum);
		
		String actualSum = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int totalSum = Integer.parseInt(actualSum);
		System.out.println("Actaul Sum is: "+totalSum);
		
		Assert.assertEquals(sum, totalSum);
	}

}
