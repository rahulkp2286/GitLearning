package SelTraning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String Name = "Rahul";
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver", "");
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Locators2 L = new Locators2();
		String password = getPassword(driver);  // set method getPassword as static so you can directly call in main block, without creating object of class 
		//String password = L.getPassword(driver); 
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		
		String expectedMessage = driver.findElement(By.tagName("p")).getText();
		System.out.println(expectedMessage);
		Assert.assertEquals(expectedMessage, "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class = 'login-container'] h2")).getText(), "Hello "+Name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		//driver.findElement(By.xpath("//Button[text()='Log Out'")).click(); only availbale with xpath[no css] if you need to search element by text 
		driver.close();
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		Thread.sleep(1000);
				
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwordArray = passwordText.split("'");
		// 0th index = please use temporary password '
		// 1st index = rahulshettyacademy' to Login.
		
		//String[] passwordArray2 = passwordArray[1].split("'");
		
		// or you can use index directly on splitted array : String password = passwordArray[1].split("'")[0];
		
		// 0th index = rahulshettyacademy
		// 1st index = to Login.
		
		String password = passwordArray[1].split("'")[0];
		return password;
		
		
	}
	
	}


