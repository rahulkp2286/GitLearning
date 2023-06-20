package SelTraning;

import java.util.List;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

		//select unique checkbox from list of checkbox 
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			String checkName = "ctl00_mainContent_chk_SeniorCitizenDiscount";
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			
			List<WebElement> optionCheckBox = driver.findElements(By.cssSelector("input[id*='mainContent_chk_']"));
			//int count = optionCheckBox.size();
			
			Thread.sleep(3000);
			for(int i=0;i<optionCheckBox.size(); i++) 
			{
				String option = optionCheckBox.get(i).getAttribute("id");
				
				if(option.equalsIgnoreCase(checkName)) {
					
					optionCheckBox.get(i).click();
					break;
				}

				
			}
			//driver.close();

	}

}
