package SelTraning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		String Name = "Rahul";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.findElement(By.cssSelector("div button:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class = 'login-container'] h2")).getText(), "Hello "+Name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		//driver.findElement(By.xpath("//Button[text()='Log Out'")).click(); only availbale with xpath[no css] if you need to search element by text 
		driver.close();
				
		
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
		//Please use temporary password 'rahulshettyacademy' to Login.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String StringPassword = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(StringPassword);
		String[] passwordText = StringPassword.split("'");
		String actualPasswordText = passwordText[1];
		
		String actualPassword = actualPasswordText.split("'")[0];
		
		return actualPassword;
		
		
		
		
	}

}
