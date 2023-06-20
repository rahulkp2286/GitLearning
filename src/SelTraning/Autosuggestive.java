package SelTraning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement>options =driver.findElements(By.cssSelector("[class='ui-menu-item'] a"));	
		
		for(WebElement option :options) 
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
			//driver.close();
		}
		
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		
		while(!driver.findElement(By.cssSelector(".ui-datepicker .ui-datepicker-group .ui-datepicker-month")).getText().contains("August"))
		{
				//System.out.println(driver.findElement(By.cssSelector(".ui-datepicker .ui-datepicker-group .ui-datepicker-month")).getText());
				driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
		List<WebElement> fromDay = driver.findElements(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-last .ui-state-default"));
		int countDays = driver.findElements(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-last .ui-state-default")).size();
		
		for(int i = 0; i<countDays ; i++) {
			String actualtext = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			//System.out.println(actualtext);
			if(actualtext.equalsIgnoreCase("13"))
			{
				//driver.findElements(By.id("#form-field-travel_comp_date")).get(i).click();
				fromDay.get(i).click();
				break;
			}
			
		}
		
		
	}

}
