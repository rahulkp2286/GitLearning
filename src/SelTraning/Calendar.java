package SelTraning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
	// pending for scroll *******

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		List<WebElement> fromDay = driver.findElements(By.cssSelector(".flatpickr-day "));
		int countDays = driver.findElements(By.cssSelector(".flatpickr-day ")).size();
		
		for(int i = 0; i<countDays ; i++) {
			String actualtext = driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();
			System.out.println(actualtext);
			if(actualtext.equalsIgnoreCase("23"))
			{
				//driver.findElements(By.id("#form-field-travel_comp_date")).get(i).click();
				fromDay.get(i).click();
				break;
			}
			
		}

	}

}
