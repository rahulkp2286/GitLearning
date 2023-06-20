package SelTraning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");

		List<WebElement> options = driver.findElements(By.cssSelector("input[id*='checkBoxOption']"));
		 Thread.sleep(3000);
		String checkValueName = driver.findElement(By.cssSelector(".right-align label:nth-child(3)")).getText();
		System.out.println(checkValueName);
		for (WebElement option : options) {
			String checkBoxValue = option.getAttribute("Value");

			if (checkBoxValue.equalsIgnoreCase(checkValueName)) {

				option.click();
				WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
				Select s = new Select(dropDown);
				// s.selectByValue(checkBoxValue);
				s.selectByVisibleText(checkValueName);
				driver.findElement(By.cssSelector("#name")).sendKeys(checkValueName);
				driver.findElement(By.cssSelector("#alertbtn")).click();
				// System.out.println(driver.switchTo().alert().getText());
				String labelNameString = driver.switchTo().alert().getText();
				if (labelNameString.contains(checkValueName)) {
					System.out.println("Alert Message Success");
				} else {
					System.out.println("execution failed");
				}

				String actualLabel = labelNameString.split(",")[0].trim().split(" ")[1].trim();
				System.out.println(actualLabel);
				if (actualLabel.equals(checkValueName)) {
					Assert.assertTrue(actualLabel.contains(checkValueName));

				} else {
					Assert.assertFalse(false);
				}
				driver.switchTo().alert().accept();
				break;

			}
			
			

			/*
			 * for(int i=0;1<options.size();i++) 	
			 * { 
			 * 	String checkBoxValue = options.get(i).getAttribute("value"); 
			 * 		if(checkBoxValue.equalsIgnoreCase(checkValueName)) 
			 * 		{			  
			 * 				options.get(i).click(); 
			 * 				break; 
			 * 		}
			 * }
			 */

		}
		
	}

}
