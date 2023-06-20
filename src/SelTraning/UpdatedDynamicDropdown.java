package SelTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'BHO']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
		driver.findElement(
				By.xpath("//div[@id= 'glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value  =  'MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// parent child traverse - using tag //form/p -xpath & form p - css
		// vs
		
		// parent child relationship using xpath -- //tagname[@attribute='value']
		// //tagname[@attribute='value']
		
		// parent child relationship using using css -- tagname[attribute='value']
		// tagname[attribute='value']

	}

}