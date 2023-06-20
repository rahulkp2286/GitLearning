package SelTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_WindowAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		
		// Syntax :-    http://Username:Password@SiteURL
		driver.get("http://admin:admin@the-internet.herokuapp.com/");		
		driver.findElement(By.linkText("Basic Auth")).click();
		
		//chnages in 2nd file 
		System.out.println("line code change 6");
		

	}

}
