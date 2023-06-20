package SelTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value = 'option1']")).isSelected());
		driver.findElement(By.cssSelector("input[value = 'option1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value = 'option1']")).isSelected());
		driver.findElement(By.cssSelector("input[value = 'option1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value = 'option1']")).isSelected());
		Thread.sleep(1000);
		
		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
		Thread.sleep(2000);
		//driver.close();
		

	}

}
