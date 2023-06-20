package SelTraning;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				
				System.setProperty("webdriver.gecko.driver","C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\geckodriver-v0.33.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				
				
				//System.setProperty("webdriver..driver","C:\Users\RahPoo\OneDrive\Selenium Practice\IEDriverServer_Win32_4.8.1\\IEdriverServer.exe");
				//WebDriver driver = new InternetExplorerDriver();
				
				driver.get("https://rahulshettyacademy.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
				//driver.quit();
				

	}

}
